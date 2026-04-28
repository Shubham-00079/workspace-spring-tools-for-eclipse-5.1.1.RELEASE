package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@Controller
public class StudentController {
	@Autowired //it is used to connect with service class
	StudentService ss;
@GetMapping("/")
	String welcome() {
	return "index";
}
@PostMapping("/student")
@ResponseBody
public Student studentDetail( @RequestParam String name, @RequestParam int roll,@RequestParam int age,@RequestParam String gender,@RequestParam String email) {
return ss.getStudent(name,roll,age,gender, email);
	
}

}
