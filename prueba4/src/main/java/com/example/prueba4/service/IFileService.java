package com.example.prueba4.service;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import com.example.prueba4.objeto.Union;
import org.springframework.http.ResponseEntity;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IFileService {

    Union findVisit() throws FileNotFoundException, IOException;

    ResponseEntity <GenericResponseDTO> createVisit (GenericRequestDTO genericRequestDTO) ;
}
