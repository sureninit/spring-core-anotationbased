package com.vastika.spring_core.service;

import org.springframework.stereotype.Component;

@Component("letter")
public class LetterServiceImp implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" is send by letter.");

	}

}
