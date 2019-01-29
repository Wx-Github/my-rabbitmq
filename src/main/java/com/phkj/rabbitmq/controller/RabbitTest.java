package com.phkj.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phkj.rabbitmq.sender.HelloSender1;

@Controller
@RequestMapping("/rabbit")
public class RabbitTest {
	@Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender1 helloSender2;
    
    @GetMapping("/hello")
    public void hello() {
		helloSender1.send();
	}
}
