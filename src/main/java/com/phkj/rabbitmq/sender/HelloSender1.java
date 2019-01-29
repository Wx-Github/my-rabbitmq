package com.phkj.rabbitmq.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender1 {

	@Autowired
	private AmqpTemplate rabbitTemplate;
	public void send() {
		String sendMsg = "hello1 : " + new Date();
		System.out.println(sendMsg);
		this.rabbitTemplate.convertAndSend("helloQ", sendMsg);
	}
	
}
