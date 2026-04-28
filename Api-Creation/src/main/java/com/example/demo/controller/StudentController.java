package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
@GetMapping("/attendance")
	public String attendance() {
		return "Student attendace -api";
	}
@GetMapping("/placement")
	public String placement() {
		return "Student placement -api";
	}
}
