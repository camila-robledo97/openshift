package com.invima.onlineprocedure.service.srvQuery.web.api.rest.v1;

import com.invima.onlineprocedure.service.srvQuery.canonico.GenericRequestDTO;
import com.invima.onlineprocedure.service.srvQuery.canonico.GenericResponseDTO;
import com.invima.onlineprocedure.service.srvQuery.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/query")
@CrossOrigin({"*"})
public class QueryController  implements IQueryController {

    @Autowired
    IQueryService queryService;


    @Override
    @GetMapping("/byStoredCode/{code}")
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



}
