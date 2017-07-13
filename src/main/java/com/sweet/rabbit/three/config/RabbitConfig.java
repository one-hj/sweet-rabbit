package com.sweet.rabbit.three.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hj on 2017/7/11.
 *
 * @author hj
 */
@Configuration
public class RabbitConfig {

	@Bean
	Queue consoleQueue() {
		return new Queue("green");
	}

	@Bean
	Queue fileQueue() {
		return new Queue("blue");
	}

	@Bean
	FanoutExchange logExchange() {
		return new FanoutExchange("log-exchange");
	}

	@Bean
	List<Binding> binding(List<Queue> queueList, FanoutExchange exchange) {
		return queueList
				.stream()
				.map(queue -> BindingBuilder.bind(queue).to(exchange))
				.collect(Collectors.toList());
	}
}
