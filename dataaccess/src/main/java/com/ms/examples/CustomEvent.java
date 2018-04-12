package com.ms.examples;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	private String msg;
	private String name;

	public CustomEvent(Object source, String msg, String name) {
		super(source);
		this.msg = msg;
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
