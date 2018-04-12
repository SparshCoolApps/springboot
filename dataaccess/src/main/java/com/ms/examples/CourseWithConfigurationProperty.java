package com.ms.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseWithConfigurationProperty {

	@Autowired
	private CourseConfigurationProperty courseConfigurationProperty;
	
	@GetMapping("/cp_version")
	public String getCourseVersion() {
		return courseConfigurationProperty.getVersion();
	}

	@GetMapping("/cp_department")
	public String getCourseDept() {
		return courseConfigurationProperty.getDepartment();
	}

	@GetMapping("/cp_head")
	public String getCourseHead() {
		return courseConfigurationProperty.getHead();
	}

	@GetMapping("/cp_marketingteam")
	public String getCourseMaketingTeam() {
		return courseConfigurationProperty.getMteam();
	}

}
