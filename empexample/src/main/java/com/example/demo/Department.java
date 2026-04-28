package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Department {
int id;
String depName;
public Department(@Value("${emp.id}")int id, @Value("${dep.name}")String depName) {
	super();
	this.id = id;
	this.depName = depName;
}

}
