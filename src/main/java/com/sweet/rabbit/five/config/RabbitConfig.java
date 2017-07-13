package com.sweet.rabbit.five.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Configuration
public class RabbitConfig {

	@Bean("errorQueue")
	Queue errorQueue() {
		return new Queue("error");
	}

	@Bean("appQueue")
	Queue appQueue() {
		return new Queue("app");
	}

	@Bean
	TopicExchange logExchange() {
		return new TopicExchange("alog-exchange");
	}

	@Bean
	List<Binding> binding(Queue errorQueue, Queue appQueue, TopicExchange exchange) {
		return Arrays.asList(
				BindingBuilder.bind(errorQueue).to(exchange).with("*.ERROR"),
				BindingBuilder.bind(appQueue).to(exchange).with("app.*")
		);
	}
}
