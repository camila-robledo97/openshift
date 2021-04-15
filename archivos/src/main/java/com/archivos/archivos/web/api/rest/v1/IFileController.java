package com.archivos.archivos.web.api.rest.v1;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface IFileController {

    ResponseEntity <GenericResponseDTO> findVisit() throws IOException;
    ResponseEntity <GenericResponseDTO> createVisit (GenericRequestDTO genericRequestDTO);
}
