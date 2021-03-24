package com.example.demo2.web.api.rest.v1;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IQueryController {

//    ResponseEntity<GenericResponseDTO> proc_parameter_code(String codeParameter);
    ResponseEntity <GenericResponseDTO> find_stored_procedure(String code, GenericRequestDTO genericRequestDTO,
                                                              int pageSize, int page,String orderBy,String order);
    ResponseEntity <GenericResponseDTO> findAll();
    ResponseEntity <GenericResponseDTO> findAllVisit();
}
