package com.ms.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

	@Autowired
	private ApplicationEventPublisher publisher;

	public void publish(String msg, String name) {
		System.out.println("Publishing custom event.");
		CustomEvent event = new CustomEvent(this, msg, name);
		publisher.publishEvent(event);
	}

}
