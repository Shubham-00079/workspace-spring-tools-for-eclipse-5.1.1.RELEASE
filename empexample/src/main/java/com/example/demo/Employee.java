package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
int id;
String empname;
double salary;
Department dep;

public Employee(@Value("${emp.id}") int id,@Value("${emp.name}") String empname,@Value("${emp.salary}") double salary, Department dep) {
	super();
	this.id = id;
	this.empname = empname;
	this.salary = salary;
	this.dep = dep;
}

void work() {
	System.out.println("Employee is Working...");
}

void detail() {
	System.out.println(id);
	System.out.println(empname);
	System.out.println(salary);
	System.out.println(dep.depName);
}
}
