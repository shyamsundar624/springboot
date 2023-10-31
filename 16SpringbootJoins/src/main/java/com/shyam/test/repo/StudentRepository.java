package com.shyam.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shyam.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("select s.studentName,c.courseName from Student s INNER JOIN s.courses c")
	public List<Object[]> getStudentNameAndCourseName();
	
	//@Query("select s.studentName,c.courseName from Student s LEFT JOIN s.courses c")
	@Query("select s.studentName,c.courseName from Student s LEFT JOIN s.courses c  where c IS NULL")
	public List<Object[]> getStudentNameAndCourseNameifExist();
	
	//@Query("select c.courseName,s.studentName from Student s RIGHT JOIN s.courses c")
	@Query("select c.courseName,s.studentName from Student s RIGHT JOIN s.courses c where s IS NULL")
	public List<Object[]> getCourseNameAndStudentNameifExist();
	
	
}
