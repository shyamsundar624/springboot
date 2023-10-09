package com.shyam.test.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.Student;
import com.shyam.test.repo.StudentRepository;
//@Component
public class StudentSaveTestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {

		repo.saveAll(Arrays.asList(
				new Student(12,"shyam","a",343.343),
				new Student(13,"sangam","b",353.343),
				new Student(14,"pankaj","c",383.343),
				new Student(15,"awanish","a",3653.343),
				new Student(16,"navin","d",353.343)
				));
	}

}
