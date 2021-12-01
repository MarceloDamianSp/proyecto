package com.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication()
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ProyectoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProyectoApplication.class, args);

	}

}
