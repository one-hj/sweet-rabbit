package com.sweet.rabbit.three.send;

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

	public void send(int no) {
		String message = "I am sweet three message (" + no + ")";

		amqpTemplate.convertAndSend("log-exchange", "", message);

		PrintUtils.printWithBlueColor("===> Send message to rabbitmq. ({})", message);
	}
}
