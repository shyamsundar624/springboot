package com.shyam.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

public class Student {
@Id

	private Integer id;
	private String name;
	private String rollNo;
}
