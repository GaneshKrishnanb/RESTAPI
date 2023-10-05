package com.example.learnspringboot.Myfirstspringbootproject.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspringboot.Myfirstspringbootproject.bean.Course;
import com.example.learnspringboot.Myfirstspringbootproject.repository.CourseRepository;
@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/allCourse")
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
		
	}
	
	@GetMapping("/allCourse/{id}")
	public Course getUniqueCourse(@PathVariable long id){
		Optional<Course> findById = courseRepository.findById(id);
		if (findById.isEmpty()) {
			throw new RuntimeException ("No course with the specified id" + id);
		}
		return findById.get();
		
	}
	
	@PostMapping("/allCourse")
	public void insertCourse(@RequestBody Course course){
		
		courseRepository.save(course);
		
	}
	
	@PutMapping("/allCourse/{id}")
	public void updateCourseWithID(@PathVariable long id, @RequestBody Course course) {
		
		courseRepository.save(course);
	}
	
	@DeleteMapping("/allCourse/{id}")
	public void deleteCoursewithID(@PathVariable long id) {
		// TODO Auto-generated method stub
		
		courseRepository.deleteById(id);

	}

}
