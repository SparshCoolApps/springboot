package com.ms.examples;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventResultService {

	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private ApplicationEventMulticaster multiCaster;
	
	
	@GetMapping("/syncevent")
	public String fireSyncevent(){
		publisher.publishEvent(new CustomEvent(this, "- Custom Sync message -", "SyncEvent(ApplicationEventPublisher)"));
		return "sync event completed"; 
	}
	
	
	@GetMapping("/asyncevent")
	public String fireaSyncevent(){
		multiCaster.multicastEvent(new CustomEvent(this, "- Custom aSync message -","aSyncEvent(ApplicationEventMulticaster)"));
		return "a sync event completed"; 
	}
	
}
