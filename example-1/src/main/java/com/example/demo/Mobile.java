package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mobile implements ElectronicDevice {

	@Override
	public void useDevice() {
		// TODO Auto-generated method stub
		System.out.println("Mobile is getting use...");
	}

}
