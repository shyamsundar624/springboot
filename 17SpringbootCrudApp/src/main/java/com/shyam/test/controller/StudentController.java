package com.shyam.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.test.entity.Student;
import com.shyam.test.repo.StudentRepository;

//@Controller
@RestController
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		Student save = repo.save(student);
		return "Save Student With Id: "+save.getId();
	}
	
	@PutMapping("update")
	public String updateStudent(@RequestBody Student student) {
		repo.save(student);
		return "Student Updated Succesfully";
	}
	@GetMapping("fetch/{id}")
	public Student getStudent(@PathVariable Integer id) {
		Optional<Student> findById = repo.findById(id);
		return findById.get();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		repo.deleteById(id);
		return "Student Deleted Successfully";
	}
	
	@GetMapping("/all")
	public List<Student> getAll(){
	return	repo.findAll();
	}
}
