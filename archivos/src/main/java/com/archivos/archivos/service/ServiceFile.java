package com.archivos.archivos.service;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.GVisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.GVisitDAO;
import com.archivos.archivos.commons.converter.FileConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ServiceFile implements IFileService {

    ObjectMapper objectMapper = new ObjectMapper();
    public final FileConverter converter;
   // public final IRepository repository;

    @Autowired
    public ServiceFile(FileConverter converter) {
        this.converter = converter;
       // this.repository = repository;
    }

    @Override
    public ResponseEntity <GenericResponseDTO> findVisit() throws IOException{

        File archivo = new File("src/main/resources/mock.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);


        String json= "";

        String linea;
        while((linea=br.readLine())!=null)
            json = json +linea;
        System.out.println(json);

        return new ResponseEntity <>(GenericResponseDTO.builder()
                .statusCode(HttpStatus.OK.value())
                .objectResponse(json)
                .message("SUCCESS")
                .build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity <GenericResponseDTO> createVisit(GenericRequestDTO genericRequestDTO) {
        GVisitDTO gVisitDTO = objectMapper.convertValue(genericRequestDTO.getRequest(), GVisitDTO.class);
        GVisitDAO gVisitDAO = converter.GVisitDTOtoGVisitDao(gVisitDTO);
        //    repository.save(gVisitDAO);

        return new ResponseEntity<>(GenericResponseDTO.builder()
                .message("Visit Created")
                .objectResponse(gVisitDAO)
                .statusCode(HttpStatus.CREATED.value())
                .build(), HttpStatus.CREATED);
    }
}
