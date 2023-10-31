package com.shyam.test.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.Course;
import com.shyam.test.entity.Student;
import com.shyam.test.repo.StudentRepository;

@RestController
public class Controller {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/save")
	public Student saveStudent() {
		Course c1=new Course();
		c1.setCourseName("Springboot");
		c1.setCoursefee(6000);
		
		Course c2=new Course();
		c2.setCourseName("Angular");
		c2.setCoursefee(5000);
		
		Student s=new Student();
		s.setStuName("Pankaj");
		
		s.setCourses(Arrays.asList(c1,c2));
		
		Student save = repo.save(s);
		return save;
	}
}
