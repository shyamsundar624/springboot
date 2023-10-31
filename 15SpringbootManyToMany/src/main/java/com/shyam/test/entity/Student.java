package com.shyam.test.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_TAB")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	private String stuName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE",
	joinColumns = @JoinColumn(name="student_ID"),
	inverseJoinColumns = @JoinColumn(name="course_id")
			)
	private List<Course> courses;

}
