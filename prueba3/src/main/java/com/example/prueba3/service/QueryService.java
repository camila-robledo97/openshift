package com.example.prueba3.service;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.InputDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.QueryReportDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.TestVisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.query.QueryReportDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.VisitDAO;
import com.example.prueba3.commons.converter.QueryConverter;
import com.example.prueba3.repository.IQueryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QueryService implements IQueryService {

    ObjectMapper objectMapper = new ObjectMapper();
    private final QueryConverter converter;
    private final IQueryRepository queryRepository;



    @Autowired
    public QueryService(QueryConverter converter, IQueryRepository queryRepository) {
        this.converter = converter;
        this.queryRepository = queryRepository;
    }

    @Override
    public ResponseEntity <GenericResponseDTO> findAll() {
        List <QueryReportDAO> queryReportDAOList = queryRepository.findAll();

        List <QueryReportDTO> queryReportDTOList = converter.queryReportDTOToQueryReportDAOList(queryReportDAOList);

        return new ResponseEntity <>(GenericResponseDTO.builder()
                .statusCode(HttpStatus.OK.value())
                .objectResponse(queryReportDTOList)
                .message("SUCCESS")
                .build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity <GenericResponseDTO> findStoredProcedure(String code, GenericRequestDTO genericRequestDTO,
                                                                   int pageSize, int page, String orderBy, String order) {
        QueryReportDAO queryReportDAO = queryRepository.find_stored_procedure(code);
        QueryReportDTO queryReportDTO = converter.queryReportDTOToQueryReportDAO(queryReportDAO);
        InputDTO inputDTO = objectMapper.convertValue(genericRequestDTO.getRequest(), InputDTO.class);
        String converJson = new String();
        try {
            converJson = objectMapper.writeValueAsString(inputDTO);
        } catch (IOException e) {
            e.printStackTrace();
        }



        List <Object[]> objects =  queryRepository.proc_parameter_code(queryReportDTO.getStoredProcedure(), converJson,pageSize,page,orderBy,order);
        if (objects == null) {
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .statusCode(HttpStatus.CONFLICT.value())
                    .message("not found none attribute for your search")
                    .build(), HttpStatus.OK);
        }
        Integer count = null;
        List <Object> Respuesta = null;
        switch (code) {
            case "proc01":
                List <ParameterDTO> parameterDTO1 = converter.queryStoredProcedureToParameterDTOList(objects);
                Respuesta = Collections.singletonList(parameterDTO1);
             //   count = objects.get(0);

                break;
            case "proc02":
                List <VisitDTO> visitDTO = converter.queryStoredProcedureToVisitDTOList(objects);
                Respuesta = Collections.singletonList(visitDTO);
                //count = objects[0].get(0);
                break;
            case "proc03":
                List <TestVisitDTO> testVisitDTO = converter.queryTestVisitDTOToTestVisitDAOList(objects);
                Respuesta = Collections.singletonList(testVisitDTO);
                while (count == null){
                    for(Object[] object: objects){
                        count = (Integer) object[0];

                            break;

                    }

                }

                break;
        }
        return new ResponseEntity <>(GenericResponseDTO.builder()
                .statusCode(HttpStatus.OK.value())
                .objectResponse(Respuesta)
                .message("total atributos: "+count.toString())
                .build(), HttpStatus.OK);
    }
}
