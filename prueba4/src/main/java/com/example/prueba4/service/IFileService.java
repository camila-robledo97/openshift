package com.example.prueba4.service;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import org.springframework.http.ResponseEntity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public interface IFileService {

    ResponseEntity <GenericResponseDTO> findVisit() throws FileNotFoundException, IOException;

    ResponseEntity <GenericResponseDTO> createVisit (GenericRequestDTO genericRequestDTO) ;
}
