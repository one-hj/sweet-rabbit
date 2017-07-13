package com.sweet.rabbit.three.application;

import com.sweet.rabbit.three.config.RabbitConfig;
import com.sweet.rabbit.three.recv.Receiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {
		RabbitConfig.class,
		Receiver.class
})
public class RabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitApplication.class, args);
	}
}
