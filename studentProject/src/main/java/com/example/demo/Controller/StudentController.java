package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
StudentService ss;

public StudentController(StudentService ss) {
	super();
	this.ss = ss;
}
@PostMapping("/create")
public String create(@RequestBody Student st) {
	ss.createStudent(st);
	return "Student is saved";
}
@GetMapping("/get/{roll}")
public Student get(@PathVariable int roll) {
	 return ss.getStudent(roll);
}
@GetMapping("/getall")
public List<Student> getAll() {
	 return ss.getAllStudent();
}
@DeleteMapping("/delete/{roll}")
public void delete(@PathVariable int roll) {
	ss.delete(roll);
}
@PostMapping("/update/{name}")
public Student update(@PathVariable String name, @RequestBody Student st) {
	st.setName(name);
	return ss.update(st);
}

@GetMapping("/get/{email}")
public Student get(String email) {
	return ss.getStudent(email);
}
}
