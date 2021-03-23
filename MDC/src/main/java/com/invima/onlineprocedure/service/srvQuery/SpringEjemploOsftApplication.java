package com.invima.onlineprocedure.service.srvQuery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringEjemploOsftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEjemploOsftApplication.class, args);
	}

}
