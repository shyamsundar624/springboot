package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
