package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.Car;

public interface Repository extends JpaRepository<Car, Integer> {

}
