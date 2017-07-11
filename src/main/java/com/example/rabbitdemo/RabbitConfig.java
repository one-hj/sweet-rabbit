package com.example.rabbitdemo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Configuration
public class RabbitConfig {


	@Bean
	public Queue whiteQueue() {
		return new Queue("white");
	}
}
