package com.sweet.rabbit.five.send;

import com.sweet.rabbit.PrintUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Component
public class Sender {

	@Autowired
	AmqpTemplate amqpTemplate;

	public void send(String facility, String level) {
		String key = facility + "." + level;
		
		String message = "I am sweet four message (" + key + ")";

		amqpTemplate.convertAndSend("alog-exchange", key, message);

		PrintUtils.printWithBlueColor("===> Send message to rabbitmq. ({})", message);
	}
}
