package com.sweet.rabbit.four.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
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

	@Bean("allQueue")
	Queue allQueue() {
		return new Queue("all");
	}

	@Bean
	DirectExchange logExchange() {
		return new DirectExchange("log-exchange");
	}

	@Bean
	List<Binding> binding(Queue errorQueue, Queue allQueue, DirectExchange exchange) {
		return Arrays.asList(
				BindingBuilder.bind(errorQueue).to(exchange).with("ERROR"),
				BindingBuilder.bind(allQueue).to(exchange).with("INFO"),
				BindingBuilder.bind(allQueue).to(exchange).with("WARN"),
				BindingBuilder.bind(allQueue).to(exchange).with("ERROR")
		);
	}
}
