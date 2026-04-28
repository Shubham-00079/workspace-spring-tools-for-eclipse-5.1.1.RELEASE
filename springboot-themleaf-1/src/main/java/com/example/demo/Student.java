package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Student {
	@GetMapping("/{name}")
	public String okkk(@PathVariable String name,Model m) { //add data to the model;
		m.addAttribute("message",name);
		return "NewFile";
	}

}
