package com.example.rabbitdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Component
@RabbitListener(queues = "white")
public class Receiver {

	private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

	@RabbitHandler
	public void receive(String message) {
		logger.info("Receive message from rabbitmq, the message is : {}", message);

	}
}
