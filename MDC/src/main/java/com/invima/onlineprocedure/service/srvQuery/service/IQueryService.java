package com.invima.onlineprocedure.service.srvQuery.service;


import com.invima.onlineprocedure.service.srvQuery.canonico.GenericRequestDTO;
import com.invima.onlineprocedure.service.srvQuery.canonico.GenericResponseDTO;
import org.springframework.http.ResponseEntity;

public interface IQueryService {

    ResponseEntity <GenericResponseDTO> findStoredProcedure(String code, GenericRequestDTO genericRequestDTO,
                                                            int pageSize, int page, String orderBy, String order);
    ResponseEntity <GenericResponseDTO> findAll();
}
