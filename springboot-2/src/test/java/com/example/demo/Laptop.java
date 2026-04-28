package com.example.demo;

public class Laptop {

OS os;

public Laptop(OS os) {
	// TODO Auto-generated constructor stub
	this.os = os;
}
void build() {
	System.out.print("Laptop is On");
	os.operating();
}

}
