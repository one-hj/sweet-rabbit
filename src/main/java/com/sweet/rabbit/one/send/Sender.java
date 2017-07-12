package com.sweet.rabbit.one.send;

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

	public void send() {
		String message = "I am sweet one message";

		amqpTemplate.convertAndSend("white", message);

		PrintUtils.printWithBlueColor("===> Send message to rabbitmq. ({})", message);
	}
}
