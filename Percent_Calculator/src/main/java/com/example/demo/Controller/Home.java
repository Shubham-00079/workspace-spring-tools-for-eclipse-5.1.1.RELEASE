package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
@GetMapping("/")
public String welcome() {
	return "Home";
}
@PostMapping("/result")
@ResponseBody
	double marks(@RequestParam int m1,@RequestParam int m2,@RequestParam int m3,@RequestParam int m4,@RequestParam int m5) {
		return (m1+m2+m3+m4+m5)/5;
	}
}
