package com.archivos.archivos.web.api.rest.v1;


import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import com.archivos.archivos.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/dev/v1")
@CrossOrigin({"*"})
public class FileController implements  IFileController{

    private final IFileService fileService;


    @Autowired
    public FileController(IFileService fileService) {
        this.fileService = fileService;
    }


    @Override
    @GetMapping("/visitas")
    public ResponseEntity <GenericResponseDTO> findVisit() throws IOException {
        return fileService.findVisit();
    }

    @Override
    @PostMapping("/gestion-visita")
    public ResponseEntity <GenericResponseDTO> createVisit(GenericRequestDTO genericRequestDTO) {
        return fileService.createVisit(genericRequestDTO);
    }
}
