package com.example.prueba3.service;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import org.springframework.http.ResponseEntity;

public interface IQueryService {

    ResponseEntity <GenericResponseDTO> findAll();
    ResponseEntity <GenericResponseDTO> findStoredProcedure(String code, GenericRequestDTO genericRequestDTO,
                                                            int pageSize, int page, String orderBy, String order);

}
