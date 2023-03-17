package com.saggraha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.saggraha.log.LoggingTest1;

@SpringBootApplication
public class SpringbootLogging1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringbootLogging1Application.class, args);
		LoggingTest1 loggingTest1 = container.getBean(LoggingTest1.class);
		loggingTest1.testOneMethod();
		
	}

}
