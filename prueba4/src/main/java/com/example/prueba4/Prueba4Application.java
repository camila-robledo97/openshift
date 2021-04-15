package com.example.prueba4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"co.com.invima.onlineprocedure.canonicalmodel"})
public class Prueba4Application {

    public static void main(String[] args) {
        SpringApplication.run(Prueba4Application.class, args);
    }


}
