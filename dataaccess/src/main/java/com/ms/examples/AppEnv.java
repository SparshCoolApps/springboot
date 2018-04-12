package com.ms.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppEnv {

	@Value("${profile}")
	private String profile;
	
	@Value("${database}")
	private String database;
	
	
	@Autowired
	private Environment env;
	
	@GetMapping("/javahome")
	public String getJavaHome(){
		return env.getProperty("JAVA_HOME");
	}
	
	@GetMapping("/app.menus")
	public String getappMenus(){
		return env.getProperty("app.menus");
	}

	@GetMapping("/app.username")
	public String getappUserName(){
		return env.getProperty("app.username");
	}

	@GetMapping("/profile")
	public String getstageName(){
		return env.getProperty("profile");
	}

	@GetMapping("/database")
	public String getdatabaseName(){
		return env.getProperty("database");
	}

	@GetMapping("/arg_profile")
	public String getArgStageName(){
		return profile;
	}

	@GetMapping("/arg_database")
	public String getArgdatabaseName(){
		return database;
	}
	
}
