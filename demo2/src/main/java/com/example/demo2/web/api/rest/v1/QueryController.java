package com.example.demo2.web.api.rest.v1;

import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericRequestDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.generic.GenericResponseDTO;
import com.example.demo2.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/query")
@CrossOrigin({"*"})
public class QueryController implements IQueryController{

    @Autowired
    IQueryService queryService;

//    @Override
//    @GetMapping("/byCode/{codeParameter}")
//    public ResponseEntity<GenericResponseDTO> proc_parameter_code(@PathVariable ("codeParameter") String codeParameter) {
//
//        return queryService.proc_parameter_code(codeParameter);
//    }

    @Override
    @GetMapping("/byStoredCode/{code}")
    public ResponseEntity <GenericResponseDTO> find_stored_procedure(@PathVariable ("code") String code,
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


    @Override
    @GetMapping("/visit/")
    public ResponseEntity <GenericResponseDTO> findAllVisit() {
        return queryService.findAllVisit();
    }
}
