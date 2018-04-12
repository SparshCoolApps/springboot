package com.ms.examples;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "course")
public class CourseConfigurationProperty {

	private String version;

	private String department;

	private String head;

	private String mteam;


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getMteam() {
		return mteam;
	}

	public void setMteam(String mteam) {
		this.mteam = mteam;
	}

}
