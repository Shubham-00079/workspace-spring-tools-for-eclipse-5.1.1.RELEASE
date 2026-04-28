package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Linux implements OS{

	@Override
	public void operating() {
		// TODO Auto-generated method stub
		System.out.println("Linux is Operating");
	}



}
