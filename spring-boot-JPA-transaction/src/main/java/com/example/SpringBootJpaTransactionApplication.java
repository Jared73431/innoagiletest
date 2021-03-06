package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringBootJpaTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaTransactionApplication.class, args);
	}

}
