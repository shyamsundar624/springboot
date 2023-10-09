package com.shyam.test.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.shyam.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String name);

	List<Student> findByfeesGreaterThan(double fees);

	List<Student> findByfeesLessThan(double fees);

	List<Student> findByNameLike(String expression);

	List<Student> findByNameStartingWith(String name);

	List<Student> findByNameEndingWith(String name);

	List<Student> findByNameContaining(String name);

	@Query("select s.name from Student s")
	List<String> getAllStudentName();
	
	//@Query("from Student")
	@Query("select s from Student s")
	List<Student> getAllStudents();
	
	@Query("select s.id,s.name from Student s")
	List<Object[]> getIdAndName();
	
	@Query("select s.name from Student s where s.id=:id")
	Optional<String> getStudentNameById(Integer id);
	
	@Query("select s from Student s where s.id=:id")
	Optional<Student> getStudentById(int id);
	
	@Query("select s from Student s where s.id in (:ids)")
	List<Student> getStudentsById(List<Integer> ids);
	
	@Transactional
	@Modifying
	@Query("update Student s set s.name=:name where s.id=:id")
	int updateNameById(String name, int id);
	
	@Transactional
	@Modifying
	@Query("update Student s set s.name=:name where s.id in(:id)")
	int updateNamesById(String name, List<Integer> id);
	@Transactional
	@Modifying
	@Query("delete Student where id=:id")
	int deleteStudentById(int id);
	
	

}
