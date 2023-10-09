package com.shyam.test.entity;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@ConfigurationProperties("my.info")
public class Student {
private int id;
private String name;
private String course;

private Set<String> set;
private Map<String, String> map;

private Certificate certi;

}
