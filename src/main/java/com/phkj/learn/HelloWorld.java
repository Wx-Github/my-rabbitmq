package com.phkj.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@RequestMapping("/world")
	public String helloWorld() {
		return "hello world hh";
	}

}
