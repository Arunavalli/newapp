package com.example.demo.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class multiply {

	@Bean
	public void myMultiply() {
		System.out.println("Multiply method");
		System.out.println("adding log");
		for(int i=0;i<=10;i++) {
			System.out.println("5*"+i+"=="+(5*i));
		}
	}
}
