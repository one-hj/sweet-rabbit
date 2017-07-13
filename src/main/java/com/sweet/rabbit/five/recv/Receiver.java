package com.sweet.rabbit.five.recv;

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

	@RabbitListener(queues = "error")
	public void receive1(String message) {
		PrintUtils.printWithRedColor("<=== [ERROR] Receive message from rabbitmq. ({})", message);
	}

	@RabbitListener(queues = "app")
	public void receive2(String message) {
		PrintUtils.printWithGreenColor("<=== [APP] Receive message from rabbitmq. ({})", message);
	}
}
