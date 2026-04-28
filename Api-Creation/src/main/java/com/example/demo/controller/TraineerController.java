package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraineerController {
	@GetMapping("/trainer")
String startClass() {
	return "startcl Api";
}
	String addNotes() {
		return "Notes addition api";
	}
}
