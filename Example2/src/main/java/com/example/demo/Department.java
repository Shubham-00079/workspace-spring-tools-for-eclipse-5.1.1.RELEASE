package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
int depId;
String depName;



public Department(@Value("${dep.id}") int depId,@Value("${dep.name}") String depName) {
	super();
	this.depId = depId;
	this.depName = depName;
}

void depDetails() {
	System.out.println("Department Id: " + depId);
	System.out.println("Department Name: " + depName);
}
}
