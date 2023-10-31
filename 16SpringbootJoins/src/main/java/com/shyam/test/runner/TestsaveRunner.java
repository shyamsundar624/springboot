package com.shyam.test.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.Course;
import com.shyam.test.entity.Student;
import com.shyam.test.repo.CourseRepository;
import com.shyam.test.repo.StudentRepository;

@Component
public class TestsaveRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository stuRepo;
	@Autowired
	private CourseRepository couRepo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Course c1 = new Course(); c1.setCourseName("Springboot");
		 * c1.setCourseFee(86878);
		 * 
		 * Course c2 = new Course(); c2.setCourseName("Spring"); c2.setCourseFee(8878);
		 * 
		 * Course c3 = new Course(); c3.setCourseName("Angular");
		 * c3.setCourseFee(86878);
		 * 
		 * couRepo.save(c1); couRepo.save(c2); couRepo.save(c3);
		 * 
		 * Student s1=new Student(); s1.setStudentName("Sangam"); s1.setCourses(c1);
		 * 
		 * Student s2=new Student(); s2.setStudentName("Sahil"); s2.setCourses(c2);
		 * 
		 * Student s3=new Student(); s3.setStudentName("Pankaj"); s3.setCourses(null);
		 * 
		 * stuRepo.save(s1); stuRepo.save(s2); stuRepo.save(s3);
		 */
		
		/*
		 * List<Object[]> list = stuRepo.getStudentNameAndCourseName();
		 * list.stream().forEach(s->System.out.println(s[0]+" Taken Course "+s[1]));
		 */
		
		/*
		 * List<Object[]> list = stuRepo.getStudentNameAndCourseNameifExist();
		 * list.stream().forEach(s->System.out.println(s[0]+" Taken Course "+s[1]));
		 */
		
		List<Object[]> list = stuRepo.getCourseNameAndStudentNameifExist();
		list.stream().forEach(s->System.out.println(s[0]+" Taken By "+s[1]));
		
	}

}
