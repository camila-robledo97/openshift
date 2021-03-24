package com.example.prueba3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan({"co.com.invima.onlineprocedure.canonicalmodel"})
public class Prueba3Application {

    public static void main(String[] args) {
        SpringApplication.run(Prueba3Application.class, args);
    }


}
