package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Example2Application {

	public static void main(String[] args) {
	ApplicationContext ref = SpringApplication.run(Example2Application.class, args);
	 Employee e = ref.getBean(Employee.class);
	 e.work();
	 e.empDetail();
	 
	 System.out.println("=================================");
	}

}
