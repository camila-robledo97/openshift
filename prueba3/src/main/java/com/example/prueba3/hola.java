package com.example.prueba3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("saludo")
@RestController
public class hola {

    @GetMapping("/")
    public String hola() {
        return "hola";

    }

}
