package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	ElectronicDevice ref;

	void study() {
		System.out.println("Student is study");	
	}
	
	 void workingWithDevice() {
		ref.useDevice();
	}

	 public Student(ElectronicDevice ref) {
		super();
		this.ref = ref;
	 }
	 	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired //use for connectivity between beans of the class
//	Laptop ref;
//void study() {
//	System.out.println("Student is Studying");
//}
//void useLaptop() {
//	ref.work();
//}
//
//// by default it search for a Constructor......
////// u can use @Autowired
////public Student(Laptop ref) {
////	this.ref = ref;
////}
//@Autowired // only one position to 
//public void setRef(Laptop ref) {
//	this.ref = ref;
//}
//
//}
