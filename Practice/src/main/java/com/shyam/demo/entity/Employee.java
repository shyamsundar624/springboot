package com.shyam.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Employee {
	@Id
	private Integer id;
	private String name;
	 //@JsonIgnore
	//@JsonManagedReference
	//@JsonBackReference 
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
	//@JoinColumn(name="card_obj_id")
	private IDCard idCard;
}
