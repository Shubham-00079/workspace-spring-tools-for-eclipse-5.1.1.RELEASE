package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{name}")
public class Student {
String name;
int nos;
public Student(@PathVariable String name, int nos) {
	super();
	this.name = name;
	this.nos = nos;
}

public double calculate(int nos) {
	int marks=0;
	for(int i=0; i<nos; i++) {
		
	}
	return marks/nos;
}

}
