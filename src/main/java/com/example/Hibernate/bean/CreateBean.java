package com.example.Hibernate.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CreateBean {

	@Bean
	public Mibean crearBean() {
		return new Mibean();
	}
}
