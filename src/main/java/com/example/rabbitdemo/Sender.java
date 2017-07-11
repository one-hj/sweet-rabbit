package com.example.rabbitdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Component
public class Sender {

	private static final Logger logger = LoggerFactory.getLogger(Sender.class);

	@Autowired
	AmqpTemplate amqpTemplate;

	public void send() {
		amqpTemplate.convertAndSend("white", "Hello, now is " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		logger.info("Send message to rabbitmq success !");
	}
}
