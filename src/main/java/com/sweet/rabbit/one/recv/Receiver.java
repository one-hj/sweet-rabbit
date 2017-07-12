package com.sweet.rabbit.one.recv;

import com.sweet.rabbit.PrintUtils;
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

	@RabbitHandler
	public void receive(String message) {
		PrintUtils.printWithGreenColor("<=== Receive message from rabbitmq. ({})", message);
	}
}
