package com.phkj.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver1 {
	
	@RabbitHandler
	@RabbitListener(queues= {"hello"})
	public void proces(String hello) {
		System.out.println("Receiver2 : " + hello);
	}
	@RabbitHandler
	@RabbitListener(queues= {"topic.message"})
	public void proc(String hello) {
		System.out.println("Receiver3 : " + hello);
	}
	@RabbitHandler
	@RabbitListener(queues= {"fanout.A"})
	public void proce(String hello) {
		System.out.println("Receiver4 : " + hello);
	}

}
