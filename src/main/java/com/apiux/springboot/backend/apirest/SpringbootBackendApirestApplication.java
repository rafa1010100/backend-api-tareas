package com.apiux.springboot.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.apiux.springboot.backend.apirest")
public class SpringbootBackendApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApirestApplication.class, args);
	}

}
