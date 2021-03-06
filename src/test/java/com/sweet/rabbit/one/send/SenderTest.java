package com.sweet.rabbit.one.send;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hj on 2017/7/11.
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
	public void sendMessage() {
		sender.send();
	}

}