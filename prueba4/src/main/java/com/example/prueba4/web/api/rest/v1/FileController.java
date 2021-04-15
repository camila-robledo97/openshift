package com.example.prueba4.web.api.rest.v1;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import com.example.prueba4.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping("dev/v1")
@CrossOrigin({"*"})
public class FileController implements IFileController {


    private final IFileService fileService;

    @Autowired
    public FileController(IFileService queryService) {
        this.fileService = queryService;
    }


    @Override
    @GetMapping("/visitas")
    public ResponseEntity <GenericResponseDTO> findVisit() throws IOException {
        return fileService.findVisit();
    }

    @Override
    @PostMapping("/gestion-visita")
    public ResponseEntity <GenericResponseDTO> createVisit(@Valid @RequestBody GenericRequestDTO genericRequestDTO) {
        return fileService.createVisit(genericRequestDTO);
    }

}
