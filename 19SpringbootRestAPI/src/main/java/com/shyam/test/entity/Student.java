package com.shyam.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
private int id;
@JsonProperty("first_name")
private String name;
@JsonIgnore
private String password;
}
