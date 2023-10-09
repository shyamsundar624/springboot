package com.shyam.test.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.Student;
import com.shyam.test.repo.StudentRepository;
@Component
public class QueryTestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//List<String> list = repo.getAllStudentName();
		//List<Student> list = repo.getAllStudents();
		/*
		 * List<Object[]> list = repo.getIdAndName();
		 * list.stream().forEach(s->System.out.println(s[0]+" "+s[1]));
		 */
		
		/*
		 * String nameById = repo.getStudentNameById(21); if(nameById!=null) {
		 * System.out.println(nameById); }else {
		 * System.out.println("Given Id Not Exists"); }
		 */
		
		/*
		 * Optional<String> studentNameById = repo.getStudentNameById(12);
		 * 
		 * if(studentNameById.isPresent()) { System.out.println(studentNameById.get());
		 * }else { System.out.println("Given Id not Exist"); }
		 */
		
		/*
		 * Optional<Student> studentById = repo.getStudentById(12);
		 * if(studentById.isPresent()) { System.out.println(studentById.get()); }
		 */
		
		/*
		 * List<Student> studentsById = repo.getStudentsById(Arrays.asList(12,13,14));
		 * studentsById.stream().forEach(s->System.out.println(s));
		 */
		
		//int updateNameById = repo.updateNameById("Ray", 16);
		/*
		 * int updateNamesById = repo.updateNamesById("john", Arrays.asList(14,15));
		 * System.out.println("No Of Record Updated "+updateNamesById);
		 */
		
		int deleteStudentById = repo.deleteStudentById(15);
		System.out.println("No of Records Deleted "+deleteStudentById);
	}

}
