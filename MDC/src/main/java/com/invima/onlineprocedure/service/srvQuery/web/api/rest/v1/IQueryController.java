package com.invima.onlineprocedure.service.srvQuery.web.api.rest.v1;


import com.invima.onlineprocedure.service.srvQuery.canonico.GenericRequestDTO;
import com.invima.onlineprocedure.service.srvQuery.canonico.GenericResponseDTO;
import org.springframework.http.ResponseEntity;

public interface IQueryController {

    ResponseEntity <GenericResponseDTO> find_stored_procedure(String code, GenericRequestDTO genericRequestDTO,
                                                              int pageSize, int page, String orderBy, String order);
    ResponseEntity <GenericResponseDTO> findAll();
}
