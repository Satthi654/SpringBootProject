package com.saggraha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.saggraha.rest.EmployeeRestController;

@SpringBootApplication
public class DebuggingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebuggingWebApplication.class, args);
		
	}

}
