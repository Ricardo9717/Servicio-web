package com.example.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Hibernate.entity.Student;
import com.example.Hibernate.service.StudentService;

@SpringBootApplication
public class HibernateApplication {
	
	
	@Autowired
	StudentService ss;
	
	

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

}
