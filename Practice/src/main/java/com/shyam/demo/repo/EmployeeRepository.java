package com.shyam.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.shyam.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Transactional
	@Modifying
	@Query("update Employee s set s.name=:name where s.id in(:id)")
	int updateNamebyId(String name, List<Integer> id);
}
