package com.shyam.test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class Student {
	@Value("12")
	private int id;
	@Value("Shyam")
	private String name;
}
