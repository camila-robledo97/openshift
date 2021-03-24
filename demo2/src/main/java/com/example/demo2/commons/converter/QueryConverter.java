package com.example.demo2.commons.converter;

import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.QueryReportDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.query.TestVisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.query.QueryReportDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.query.TestVisitDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class QueryConverter {
/*
    public QueryReportDTO queryReportDAOToQueryReportDTO (QueryReportDAO queryReportDAO,String filter){
        if(filter.contains("nameA")){
            return QueryReportDTO.builder()
                    .codeReport(queryReportDAO.getCodeReport())
                    .tableA(QueryTablaADAO.builder()
                            .code(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getCode())
                            .nombre(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getNombre())
                             .build())
                    .tableB(QueryTablaBDAO.builder()
                            .serie(queryReportDAO.getTableB()== null ? null: queryReportDAO.getTableB().getSerie())
                            .author(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getAuthor())
                            .title(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getTitle())
                            .type(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getType())
                            .build())
                    .build();
        }else if(filter.contains("authorB")){
            return QueryReportDTO.builder()
                    .codeReport(queryReportDAO.getCodeReport())
                    .tableA(QueryTablaADAO.builder()
                            .code(queryReportDAO.getTableA() == null ? null : queryReportDAO.getTableA().getCode())
                            .nombre(queryReportDAO.getTableA() == null ? null : queryReportDAO.getTableA().getNombre())
                            .apellido(queryReportDAO.getTableA() == null ? null : queryReportDAO.getTableA().getApellido())
                            .emailAddress(queryReportDAO.getTableA() == null ? null : queryReportDAO.getTableA().getEmailAddress())
                            .build())
                    .tableB(QueryTablaBDAO.builder()
                            .serie(queryReportDAO.getTableB() == null ? null : queryReportDAO.getTableB().getSerie())
                            .author(queryReportDAO.getTableB() == null ? null : queryReportDAO.getTableB().getAuthor())

                            .build())
                    .build();
        }else{
            return QueryReportDTO.builder()
                    .codeReport(queryReportDAO.getCodeReport())
                    .tableA(QueryTablaADAO.builder()
                            .code(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getCode())
                            .nombre(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getNombre())
                            .apellido(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getApellido())
                            .emailAddress(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getEmailAddress())
                            .build())
                    .tableB(QueryTablaBDAO.builder()
                            .serie(queryReportDAO.getTableB()== null ? null: queryReportDAO.getTableB().getSerie())
                            .author(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getAuthor())
                            .title(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getTitle())
                            .type(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getType())
                            .build())
                    .build();
        }
    }

    public QueryReportDTO queryReportDAOToQueryReportDTO (QueryReportDAO queryReportDAO){
        return QueryReportDTO.builder()
                .codeReport(queryReportDAO.getCodeReport())
                .tableA(QueryTablaADAO.builder()
                        .code(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getCode())
                        .nombre(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getNombre())
                        .apellido(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getApellido())
                        .emailAddress(queryReportDAO.getTableA()== null ? null:queryReportDAO.getTableA().getEmailAddress())
                        .build())
                .tableB(QueryTablaBDAO.builder()
                        .serie(queryReportDAO.getTableB()== null ? null: queryReportDAO.getTableB().getSerie())
                        .author(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getAuthor())
                        .title(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getTitle())
                        .type(queryReportDAO.getTableB()== null ? null:queryReportDAO.getTableB().getType())
                        .build())
                .build();
    }

    public List <QueryReportDTO> queryReportDAOToQueryReportDTOList (Page <QueryReportDAO> queryReportDAOList){
        List <QueryReportDTO> queryReportDTOList= new ArrayList <>();
        for(QueryReportDAO queryReportDAO : queryReportDAOList){
            queryReportDTOList.add(queryReportDAOToQueryReportDTO(queryReportDAO));
        }
        return queryReportDTOList;
    }*/
    public ParameterDTO queryStoredProcedureToParameterDTO (Object[] objects){
        return ParameterDTO.builder()
            .id((Integer) objects[0])
            .code((String) objects[1])
            .description((String) objects[2])
            .name((String) objects[4])
            .parent(String.valueOf((Integer)objects[5]))
            .build();
}

    public List<ParameterDTO> queryStoredProcedureToParameterDTOList (List<Object[]> objects){
        List<ParameterDTO> parameterDTOS = new ArrayList <>();
        for(Object[] object: objects){
            parameterDTOS.add(queryStoredProcedureToParameterDTO(object));
        }
        return parameterDTOS;
    }

    public VisitDTO queryStoredProcedureToVisitDTO (Object[] objects){
        return VisitDTO.builder()
                .id((Integer) objects[0])
                .code((String) objects[1])
                .city( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[3]))
                        .build())
                .country( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[4]))
                        .build())
                .department( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[5]))
                        .build())
                .estado( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[6]))
                        .build())
                .prioridad( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[7]))
                        .build())
                .typeVisit( ParameterDTO.builder()
                        .code(String.valueOf((Integer)objects[8]))
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
        return TestVisitDTO.builder()
                .code((String) objects[2])
                .direction(String.valueOf(objects[4]))
                .city((String) objects[1])
                .country((String) objects[3])
                .establishmentName((String) objects[5])
                .inspector((String) objects[6])
                .productVisit(String.valueOf(objects[7]))

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
