package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
