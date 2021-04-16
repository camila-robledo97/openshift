package com.example.prueba3.commons.converter;


import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.QueryReportDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.TestVisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.query.QueryReportDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.query.TestVisitDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryConverter {
    public ParameterDTO queryStoredProcedureToParameterDTO (Object[] objects){
        return ParameterDTO.builder()
                .id((Integer) objects[1])
                .code((String) objects[2])
                .description((String) objects[3])
                .name((String) objects[5])
                .parent(String.valueOf((Integer)objects[6]))
                .build();
    }

    public List <ParameterDTO> queryStoredProcedureToParameterDTOList (List<Object[]> objects){
        List<ParameterDTO> parameterDTOS = new ArrayList <>();
        for(Object[] object: objects){
            parameterDTOS.add(queryStoredProcedureToParameterDTO(object));
        }
        return parameterDTOS;
    }

    public VisitDTO queryStoredProcedureToVisitDTO (Object[] objects){

        return VisitDTO.builder()

                .id((Integer) objects[1])
                .code((String) objects[2])
                .city( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[4]))
                        .build())
                .country( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[5]))
                        .build())
                .department( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[6]))
                        .build())
                .estado( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[7]))
                        .build())
                .prioridad( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[8]))
                        .build())
                .typeVisit( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[9]))
                        .build())
                .build();
    }

    public List<VisitDTO> queryStoredProcedureToVisitDTOList (List<Object[]> objects){
        List<VisitDTO> visitDTOS = new ArrayList <>();
        for(Object[] object: objects){
            visitDTOS.add(queryStoredProcedureToVisitDTO(object));
        }
        return visitDTOS;
    }

    public QueryReportDTO queryReportDTOToQueryReportDAO (QueryReportDAO queryReportDAO){
        return QueryReportDTO.builder()
                .codequery(queryReportDAO.getCodequery())
                .storedProcedure(queryReportDAO.getStoredProcedure())
                .nameProcedure(queryReportDAO.getNameProcedure())
                .input(queryReportDAO.getInput())
                .output(queryReportDAO.getOutput())
                .build();
    }

    public List<QueryReportDTO> queryReportDTOToQueryReportDAOList (List<QueryReportDAO> queryReportDAOList){
        List<QueryReportDTO> queryReportDTOList = new ArrayList <>();
        for(QueryReportDAO queryReportDAO: queryReportDAOList){
            queryReportDTOList.add(queryReportDTOToQueryReportDAO(queryReportDAO));
        }
        return queryReportDTOList;
    }


    public TestVisitDTO testVisitDTOToTestVisitDAO (Object[] objects){
        Integer count = (Integer) objects[0];
        return TestVisitDTO.builder()

                .code(String.valueOf(objects[3]))
                .direction(String.valueOf(objects[5]))
                .city((String) objects[2])
                .country((String) objects[4])
                .establishmentName((String) objects[6])
                .inspector((String) objects[7])
                .productVisit(String.valueOf(objects[8]))

                .build();

    }


    public List<TestVisitDTO> queryTestVisitDTOToTestVisitDAOList (List<Object[]> testVisitDAOS){
        List<TestVisitDTO> testVisitDTOList = new ArrayList <>();
        for(Object[] testVisitDAO: testVisitDAOS){
            testVisitDTOList.add(testVisitDTOToTestVisitDAO(testVisitDAO));
        }
        return testVisitDTOList;
    }



    public TestVisitDTO testVisitDTOToTestVisitDAO (TestVisitDAO objects){
        return TestVisitDTO.builder()
                .code(objects.getCode())
                .direction(objects.getDirection())
                .city(objects.getCity())
                .country(objects.getCountry())
                .establishmentName(objects.getEstablishmentName())
                .inspector(objects.getInspector())
                .productVisit(objects.getProductVisit())

                .build();
    }

    public List<TestVisitDTO> queryTestVisitDTOToTestVisitDAOList2 (List<TestVisitDAO> testVisitDAOS){
        List<TestVisitDTO> testVisitDTOList = new ArrayList <>();
        for(TestVisitDAO testVisitDAO: testVisitDAOS){
            testVisitDTOList.add(testVisitDTOToTestVisitDAO(testVisitDAO));
        }
        return testVisitDTOList;
    }
}
