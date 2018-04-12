package com.ms.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
public class MulticasterEventPublisher {

	@Bean(name="applicationEventMulticaster")
	public ApplicationEventMulticaster applicationEventMulticaster(){
		SimpleApplicationEventMulticaster sm = new SimpleApplicationEventMulticaster();
		sm.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return sm;
	}
	
}
