package com.sweet.rabbit.five.send;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hj on 2017/7/13.
 *
 * @author hj
 */
@RunWith(SpringRunner.class)
@SpringBootApplication
@SpringBootTest
public class SenderTest {

	@Autowired
	Sender sender;

	@Test
	public void send() throws Exception {
		sender.send("app", "ERROR");
		sender.send("app", "INFO");
		sender.send("app", "WARN");
		sender.send("other", "ERROR");
	}

}