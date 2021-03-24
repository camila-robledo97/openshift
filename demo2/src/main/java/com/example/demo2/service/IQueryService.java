package com.example.demo2.service;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IQueryService {

//    ResponseEntity<GenericResponseDTO> findReportByCode(String codeReport,String filter);
//    ResponseEntity<GenericResponseDTO> findAll( Integer pageNo, Integer pageSize, String sortBy);
     // ResponseEntity <GenericResponseDTO> proc_parameter_code(String codeParameter);
      ResponseEntity <GenericResponseDTO> findStoredProcedure(String code, GenericRequestDTO genericRequestDTO,
                                                              int pageSize, int page,String orderBy,String order);
      ResponseEntity <GenericResponseDTO> findAll();
      ResponseEntity <GenericResponseDTO> findAllVisit();
}
