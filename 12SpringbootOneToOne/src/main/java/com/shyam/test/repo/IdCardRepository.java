package com.shyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.test.entity.IdCard;

public interface IdCardRepository extends JpaRepository<IdCard, Integer> {

}
