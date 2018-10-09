package com.sms.springboot.employeeservicesh2;

import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class EmployeeServicesH2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicesH2Application.class, args);
	}
}
