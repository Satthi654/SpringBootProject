package com.saggraha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.saggraha.test.Testing;

@SpringBootApplication
public class DebuggingTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DebuggingTestApplication.class, args);
		Testing bean = container.getBean(Testing.class);
		bean.getData();
	}

}
