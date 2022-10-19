package com.example.Hibernate.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter @Setter 
@RequiredArgsConstructor
public class Student {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	
	 @Column
	String student_name;
	 
	 @Column
	 float score;
	 
//	 @Column
//	 int subject_id;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name="subject_id")
	 Subject subject;

	 
	 @JsonManagedReference
		public Subject getSubject() {
			return subject;
		}




	 
	 
}
