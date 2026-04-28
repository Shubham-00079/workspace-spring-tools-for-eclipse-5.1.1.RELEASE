package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.studentRepo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	public Student getStudent(String name,int roll,int age,String gender,String email) {
Student s1 = new Student(name,roll,age,gender,email);
return sr.save(s1);
	}
}
