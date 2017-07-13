package com.sweet.rabbit.three.send;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

/**
 * Created by hj on 2017/7/13.
 *
 * @author hj
 */
@RunWith(SpringRunner.class)
@SpringBootApplication
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class SenderTest {

	@Autowired
	Sender sender;

	@Test
	public void send() throws Exception {
		IntStream.range(1, 5).forEach(i -> {
			sender.send(i);
		});
	}

}