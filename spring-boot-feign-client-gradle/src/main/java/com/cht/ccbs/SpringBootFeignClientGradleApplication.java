package com.cht.ccbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients

@SpringBootApplication
public class SpringBootFeignClientGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientGradleApplication.class, args);
	}

}
