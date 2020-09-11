package com.vastika.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vastika.spring_core.config.SpringConfig;
import com.vastika.spring_core.controller.MessageController;
import com.vastika.spring_core.service.MessageService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	MessageController controller = context.getBean(MessageController.class);
    	controller.sendMessage("Hellooooooo");
    }
}
