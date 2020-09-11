package com.vastika.spring_core.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("text")

public class TextServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" is sent to mobile text.");

	}

}
