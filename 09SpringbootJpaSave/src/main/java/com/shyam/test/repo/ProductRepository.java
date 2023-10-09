package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
