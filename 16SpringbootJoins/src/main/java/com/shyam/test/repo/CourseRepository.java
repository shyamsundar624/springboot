package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
