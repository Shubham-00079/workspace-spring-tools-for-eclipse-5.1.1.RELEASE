package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpexampleApplication {

	public static void main(String[] args) {
		  ApplicationContext ac=SpringApplication.run(EmpexampleApplication.class, args);
		 Employee  emp = ac.getBean(Employee.class);
//		 Department dp = ac.getBean(Department.class);
		 emp.work();
		 emp.detail();
//		 dp.detail();
	}

}
