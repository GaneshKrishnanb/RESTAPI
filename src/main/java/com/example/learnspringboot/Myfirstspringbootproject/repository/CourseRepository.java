package com.example.learnspringboot.Myfirstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learnspringboot.Myfirstspringbootproject.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
