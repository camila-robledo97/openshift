package com.invima.onlineprocedure.service.srvQuery.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.invima.onlineprocedure.service.srvQuery.canonico.*;
import com.invima.onlineprocedure.service.srvQuery.commons.QueryConverter;
import com.invima.onlineprocedure.service.srvQuery.repository.IQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class QueryService implements IQueryService  {


    private final QueryConverter converter;
    ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private IQueryRepository queryRepository;

    public QueryService(QueryConverter converter) {
        this.converter = converter;
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
        if (page == 0 ){
            page =1;

        }
        if (pageSize == 0 ){
            pageSize =50;
        }


        List <Object[]> objects =  queryRepository.proc_parameter_code(queryReportDTO.getStoredProcedure(), converJson,
                pageSize,page,orderBy,order);
        if (objects == null) {
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .statusCode(HttpStatus.CONFLICT.value())
                    .message("not found none attribute for your search")
                    .build(), HttpStatus.OK);
        }
        List <Object> Respuesta = null;
        switch (code) {
            case "proc01":
                List <ParameterDTO> parameterDTO1 = converter.queryStoredProcedureToParameterDTOList(objects);
                Respuesta = Collections.singletonList(parameterDTO1);
                break;
            case "proc02":
                List <VisitDTO> visitDTO = converter.queryStoredProcedureToVisitDTOList(objects);
                Respuesta = Collections.singletonList(visitDTO);
                break;
            case "proc03":
                List <TestVisitDTO> testVisitDTO = converter.queryTestVisitDTOToTestVisitDAOList(objects);
                Respuesta = Collections.singletonList(testVisitDTO);
                break;
        }
        return new ResponseEntity <>(GenericResponseDTO.builder()
                .statusCode(HttpStatus.OK.value())
                .objectResponse(Respuesta)
                .build(), HttpStatus.OK);
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
}
