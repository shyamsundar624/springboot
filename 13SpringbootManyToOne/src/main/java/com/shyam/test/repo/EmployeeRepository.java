package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
