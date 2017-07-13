package com.sweet.rabbit.four.send;

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

	public void send(String level) {
		String message = "I am sweet four message (" + level + ")";

		amqpTemplate.convertAndSend("log-exchange", level, message);

		PrintUtils.printWithBlueColor("===> Send message to rabbitmq. ({})", message);
	}
}
