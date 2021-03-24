package com.example.prueba3.web.api.rest.v1;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import org.springframework.http.ResponseEntity;

public interface IQueryController {

    ResponseEntity <GenericResponseDTO> find_stored_procedure(String code, GenericRequestDTO genericRequestDTO,
                                                              int pageSize, int page, String orderBy, String order);
    ResponseEntity <GenericResponseDTO> findAll();
}
