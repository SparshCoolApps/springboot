package com.ms.examples;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringAppListener  {

	@EventListener
	public void handleEvent(ApplicationStartingEvent ev){
		System.out.println("ApplicationStartingEvent");
	}

	@EventListener
	public void handleEvent(ApplicationEnvironmentPreparedEvent ev){
		System.out.println("ApplicationEnvironmentPreparedEvent");
	}
	
	@EventListener
	public void handleEvent(ApplicationPreparedEvent ev){
		System.out.println("ApplicationPreparedEvent");
	}

	@EventListener
	public void handleEvent(ApplicationStartedEvent ev){
		System.out.println("ApplicationStartedEvent");
		
	}

	
	@EventListener
	public void handleEvent(ApplicationReadyEvent ev){
		System.out.println("ApplicationReadyEvent");
	}

	
	@EventListener
	public void handleEvent(ApplicationFailedEvent ev){
		System.out.println("ApplicationFailedEvent");
	}
	
	
	@EventListener
	public void handleEvent(CustomEvent event) {
		
		System.out.println("Long task started.....");
		// Simulate log task 
		long  i = 0;
		while (i++ <= 90000000L);
		// Simulate log task 
		System.out.println("Received Custom Message::"+event.getMsg()+" From Event:"+event.getName());
		System.out.println("Long task finished.....");
		
	}
	
	
}
