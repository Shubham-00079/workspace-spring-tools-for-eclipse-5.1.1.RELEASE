package com.example.demo.Service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
@Service
public class StudentService {
@Autowired
StudentRepo sr;
public StudentService(StudentRepo sr) {
	super();
	this.sr = sr;
}

public Student createStudent(Student st) {
return sr.save(st);
}

public Student getStudent(int roll) {
	Student st = sr.findById(roll).orElse(null);
	return st;
}

public List<Student> getAllStudent() {
	List<Student> studentList = sr.findAll();
	return studentList;
}

public Student getStudent(String email) {
	return sr.findByEmail(email);
}
public void delete(int roll) {
	sr.deleteById(roll);
}
public Student update(Student st) {
	return sr.save(st);
}
}
