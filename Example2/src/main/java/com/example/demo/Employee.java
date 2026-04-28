package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
int empId;
String empName;
int salary;
Department dep;

public Employee(
		@Value("${emp.id}")int empId, 
		@Value("${emp.name}")String empName, 
		@Value("${emp.salary}")int salary, 
		Department dep) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.dep = dep;
}
public void work() {
	System.out.println("Employee Working..");
}
void empDetail() {
	System.out.println("Emp Id: "+ empId);
	System.out.println("Emp Name: "+ empName);
	System.out.println("Emp Salary: "+ salary);
	dep.depDetails();
}
}
