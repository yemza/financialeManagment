package com.financialManagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.financialManagment.*"})

public class FinancialManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialManagmentApplication.class, args);
	}

}
