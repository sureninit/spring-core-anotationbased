package com.vastika.spring_core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vastika.spring_core.service.MessageService;

@Component
public class MessageController {
	@Autowired
	@Qualifier("letter")
	private MessageService messageService;
	@Value("${username}")
	private String name;
	

//	@Autowired
//	public void setMessageService(MessageService messageService) {
//		this.messageService = messageService;
//	}


	public void sendMessage(String message) {
		messageService.sendMessage(message);
		System.out.println("username "+name);
	}
	
	

}
