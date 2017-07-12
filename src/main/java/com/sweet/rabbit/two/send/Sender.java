package com.sweet.rabbit.two.send;

import com.sweet.rabbit.PrintUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

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
		String message = "I am sweet one message ";

		IntStream.range(1, 10).forEach(i -> {
			amqpTemplate.convertAndSend("white", message + i);

			PrintUtils.printWithBlueColor("===> Send message to rabbitmq. ({})", message + i);
		});
	}
}
