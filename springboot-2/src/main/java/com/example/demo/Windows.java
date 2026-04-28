package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Windows implements OS{

	@Override
	public void operating() {
		// TODO Auto-generated method stub
		System.out.println("Windows is Operating");
	}

}
