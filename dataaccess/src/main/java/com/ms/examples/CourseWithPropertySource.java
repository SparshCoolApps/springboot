package com.ms.examples;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(ignoreResourceNotFound=true, value="classpath:courseconfig.properties")
public class CourseWithPropertySource {

	@Value("${course.version}")
	private String version;

	@Value("${course.department}")
	private String department;

	@Value("${course.head}")
	private String head;

	@Value("${course.mteam}")
	private String mteam;

	@GetMapping("/ps_version")
	public String getCourseVersion() {
		return version;
	}

	@GetMapping("/ps_department")
	public String getCourseDept() {
		return department;
	}

	@GetMapping("/ps_head")
	public String getCourseHead() {
		return head;
	}

	@GetMapping("/ps_marketingteam")
	public String getCourseMaketingTeam() {
		return mteam;
	}

}
