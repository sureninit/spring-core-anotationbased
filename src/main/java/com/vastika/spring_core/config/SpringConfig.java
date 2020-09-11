package com.vastika.spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vastika.spring_core.controller.MessageController;
import com.vastika.spring_core.service.EmailServiceImpls;
import com.vastika.spring_core.service.MessageService;

@Configuration
@ComponentScan(basePackages = {"com.vastika.spring_core.service", "com.vastika.spring_core.controller"})
public class SpringConfig {

//	@Bean
//	public MessageService getMessageService() {
//		return new EmailServiceImpls();
//	}
//	@Bean
//	public MessageController getMessageController() {
//		return new MessageController();
//	}
}
