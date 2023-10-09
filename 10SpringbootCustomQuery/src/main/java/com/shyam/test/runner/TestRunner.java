package com.shyam.test.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.Student;
import com.shyam.test.repo.StudentRepository;

//@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Student student = repo.findByName("shyam"); System.out.println(student);
		 */
		
		/*
		 * List<Student> list = repo.findByfeesGreaterThan(370.343);
		 * list.stream().forEach(s->System.out.println(s));
		 */
		
		/*
		 * List<Student> list = repo.findByfeesLessThan(370.343);
		 * list.stream().forEach(s->System.out.println(s));
		 */
		
		
		/*
		 * List<Student> nameLike = repo.findByNameLike("%m");
		 * nameLike.stream().forEach(s->System.out.println(s));
		 */
		
		/*
		 * List<Student> nameLike = repo.findByNameStartingWith("p");
		 * nameLike.stream().forEach(s->System.out.println(s));
		 */		
		
		/*
		 * List<Student> nameLike = repo.findByNameEndingWith("m");
		 * nameLike.stream().forEach(s->System.out.println(s));
		 * 
		 */
		
		List<Student> conatining = repo.findByNameContaining("m");
		
		conatining.stream().forEach(s->System.out.println(s));
	}

}
