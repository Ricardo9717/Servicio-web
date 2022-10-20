package com.example.Hibernate.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="subject")
@Getter @Setter 
@RequiredArgsConstructor
public class Subject implements Serializable{
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	int id_s;
	
	 @Column
	 String name;
	 
	 @JsonIgnore
	 @OneToMany(cascade = CascadeType.ALL,fetch= FetchType.LAZY, 
	 mappedBy = "subject")
	 List<Student> student = new ArrayList<>();

	
	
	 //@JsonBackReference 
//		public List<Student> getStudent() {
//			return student;
//		}



}
