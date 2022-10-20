package com.example.Hibernate.request;

import com.example.Hibernate.entity.Subject;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class StudentRequest {

	int id;
	String student_name;
	float score;
	//int subject_id;
	Subject subject;
}
