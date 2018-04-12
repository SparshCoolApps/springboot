package com.ms.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Course {

    @GetMapping("/version")
    public String getCourseVersion(){
        return "v-1.1.0";
    }

    @GetMapping("/department")
    public String getCourseDept(){
        return "CS-Dept";
    }

    @GetMapping("/head")
    public String getCourseHead(){
        return "Ram Rao";
    }

    @GetMapping("/marketingteam")
    public String getCourseMaketingTeam(){
        return "Vibrant TT";
    }

}
