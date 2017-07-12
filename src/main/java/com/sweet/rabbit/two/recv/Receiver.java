package com.sweet.rabbit.two.recv;

import com.sweet.rabbit.PrintUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Component
public class Receiver {

	@RabbitListener(queues = "white")
	public void receive1(String message) {
		PrintUtils.printWithGreenColor("<=== [Receiver1] Receive message from rabbitmq. ({})", message);
	}

	@RabbitListener(queues = "white")
	public void receive2(String message) {
		PrintUtils.printWithGreenColor("<=== [Receiver2] Receive message from rabbitmq. ({})", message);
	}
}
