package com.archivos.archivos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"co.com.invima.onlineprocedure.canonicalmodel"})
public class ArchivosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchivosApplication.class, args);
    }

}
