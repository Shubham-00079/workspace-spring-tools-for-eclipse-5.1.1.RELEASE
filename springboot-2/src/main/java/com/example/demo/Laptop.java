package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

OS os;

public Laptop(OS os) {
	// TODO Auto-generated constructor stub
	this.os = os;
}
void build() {
	System.out.println("Laptop is On");
	os.operating();
}

}
