package com.phkj.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@RequestMapping("/world")
	public String helloWorld() {
		System.out.println("hh");
		System.out.println("ss");
		return "hello world hh ss";
	}

}
