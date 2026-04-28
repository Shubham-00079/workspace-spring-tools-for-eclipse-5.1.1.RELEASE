package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
@GetMapping("/attendance")
String attendance() {
	return "Student mark attendance";
}
@GetMapping("/placement")
String placement() {
	return "Student-placement-api";
}

}
