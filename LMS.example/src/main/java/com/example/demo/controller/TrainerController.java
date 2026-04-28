package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainer")
public class TrainerController {
@GetMapping("/class")
String Class() {
	return "trainer handle their class";
}
@GetMapping("/assesment")
String Assingment() {
	return "trainer give assement";
}
}
