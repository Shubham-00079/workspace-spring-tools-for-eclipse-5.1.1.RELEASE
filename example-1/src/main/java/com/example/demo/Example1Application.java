package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Example1Application {

	public static void main(String[] args) {
		 ApplicationContext ref= SpringApplication.run(Example1Application.class, args);
		 Student s = ref.getBean(Student.class);
		 s.study();
		 s.workingWithDevice(); // this is also a way to acces those method
		 // it will also access by creating constructor of the student class
	
	}

}


















//Student s = ref.getBean(Student.class);
//s.study();
//s.useLaptop();