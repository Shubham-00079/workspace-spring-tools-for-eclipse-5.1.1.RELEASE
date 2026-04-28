package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Student {
	@Id
	int rollNo;
String name;
int age;
String gender;
String email;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name,int rollNo,  int age, String gender, String email) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.email = email;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
