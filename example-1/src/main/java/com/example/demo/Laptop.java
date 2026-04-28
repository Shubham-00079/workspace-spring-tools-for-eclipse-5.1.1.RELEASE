package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements ElectronicDevice{

	@Override
	public void useDevice() {
		// TODO Auto-generated method stub
		System.out.println("Laptop is being use....");
		
	}
	


}



//void work() {
//	System.out.println("Laptop is working");
//	}
////
