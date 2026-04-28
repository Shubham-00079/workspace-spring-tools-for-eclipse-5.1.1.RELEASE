package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ref = SpringApplication.run(ExampleApplication.class, args);
		 STUDENT s1 = ref.getBean(STUDENT.class);
		 s1.setName("Shubham");
		 s1.setRoll(23);
		System.out.println(s1.getName());
		System.err.print(s1.getRoll());
	}

}
