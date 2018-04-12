package com.ms.examples;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllAppProperties {

	@Autowired
	private AppProperties appProperties;
	
	
	@GetMapping("/appmenus")
	public List<AppProperties.Menu> getAppMenus(){
		return appProperties.getMenus();
	}
	
	@GetMapping("/appcompiler")
	public AppProperties.Compiler getAppCompilerSettings(){
		return appProperties.getCompiler();
	}

	@GetMapping("/appbackupsettings")
	public List<String> getAppBackupSettings(){
		List<String> backupSettings = new ArrayList<>();
		backupSettings.add("Copies:"+new Integer(appProperties.getBackupcopies()).toString());
		backupSettings.add("User:"+appProperties.getUsername());
		backupSettings.add("Backupday:"+appProperties.getBackupday());
		
		return backupSettings;
	}

	
}
