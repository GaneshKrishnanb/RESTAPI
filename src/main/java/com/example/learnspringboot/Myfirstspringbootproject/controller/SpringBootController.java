package com.example.learnspringboot.Myfirstspringbootproject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspringboot.Myfirstspringbootproject.bean.Course;

@RestController
public class SpringBootController {
	
	@GetMapping("/course")
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return List.of(new Course(1,"JAVA","Ranga"),
				new Course(2, "MICROSERVICE", "Ranga"));
	}
	
	@GetMapping("/course1")
	public List<Course> getOneCourses() {
		// TODO Auto-generated method stub
		return List.of(new Course(1,"JAVA","Ranga"));
	}
	
	@GetMapping("/course2")
	public List<Course> getsecCourses() {
		// TODO Auto-generated method stub
		return List.of(new Course(2,"MICROSERVICE","Ranga"));
	}

}
