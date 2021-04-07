package com.example.prueba3.web.api.rest.v1;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import com.example.prueba3.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1/query")
@CrossOrigin({"*"})
public class QueryController implements IQueryController{


    private final IQueryService queryService;

    @Autowired
    public QueryController(IQueryService queryService) {
        this.queryService = queryService;
    }

    @Override
    @PostMapping("/byStoredCode/{code}")
    public ResponseEntity <GenericResponseDTO> find_stored_procedure(@PathVariable("code") String code,
                                                                     @Valid @RequestBody GenericRequestDTO genericRequestDTO,
                                                                     @RequestParam int pageSize,
                                                                     @RequestParam int page,
                                                                     @RequestParam String orderBy,
                                                                     @RequestParam String order) {
        return queryService.findStoredProcedure(code,genericRequestDTO,pageSize,page,orderBy,order);
    }

    @Override
    @GetMapping("/")
    public ResponseEntity <GenericResponseDTO> findAll() {
        return queryService.findAll();
    }

    @GetMapping("/hola/")
    public String hola() {
        return "hola";
    }

}
