package com.cht.ccbs.bc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bhaiti"})
public class Ccbs2BcBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ccbs2BcBatchApplication.class, args);
	}

}
