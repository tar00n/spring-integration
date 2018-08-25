package com.tarungarg.springintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
@ImportResource("classpath*:/META-INF/spring/si-components.xml")
public class SpringIntegrationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIntegrationApplication.class, args);
		
		/*MessageChannel channel = context.getBean("messageChannel", MessageChannel.class);
		
		Message<String> message1 = MessageBuilder.withPayload("Hello world - one!").build();
		Message<String> message2 = MessageBuilder.withPayload("Hello world - two!").build();
		Message<String> message3 = MessageBuilder.withPayload("Hello world - three!").build();
		
		System.out.println("Sending message1");
		channel.send(message1);
		System.out.println("Sending message2");
		channel.send(message2);
		System.out.println("Sending message3");
		channel.send(message3);
		System.out.println("done sending message");*/
	}
}
