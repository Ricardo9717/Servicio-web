package com.example.Hibernate.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hibernate.entity.Student;
import com.example.Hibernate.entity.Subject;
import com.example.Hibernate.exception.StudentNotFound;
import com.example.Hibernate.repo.StudentRepository;
import com.example.Hibernate.repo.Subjectrepository;
import com.example.Hibernate.request.StudentRequest;

@Service
public class StudentService {

	private StudentRepository sr;
	
	public StudentService(StudentRepository sr) {
		this.sr= sr;
	}
	
	@Autowired
	private Subjectrepository sr1;
	
	
	public List<Student> getStudents(){

        return sr.findAll() ;
    }
	
	public List<Subject> getSubjects(){

        return sr1.findAll() ;
    }
	
	public void setStudent( StudentRequest sreq){
        System.out.println(sreq.getStudent_name());
        Student s = new Student();
        s.setId(sreq.getId());
        s.setStudent_name(sreq.getStudent_name());
        s.setScore(sreq.getScore());
        s.setSubject(sreq.getSubject());
        //s.setSubject_id(sreq.getSubject_id());
        sr.save(s);
    }
	
	public Student getStudentById(int id) {
        Student s = sr.findById(id).orElseThrow(
                () -> new StudentNotFound("student with id " + id + " not found"));
        return s;
    }
	
	
	 /* public Student getStudentById(int id) {
        Student s = sr.findById(id).orElseThrow(
                () -> new IllegalStateException("student with id " + id + " not found"));
        return s;
    }*/
	 
	 
	
	 public void deleteStudent( int id){
	        //System.out.println(s.toString());
		 sr.findById(id).orElseThrow(
	                () -> new IllegalStateException("student with id" +" "+ id + " "+"not found"));
		 
		 sr.deleteById(id);
	    }
	 
	 
	    @Transactional
	    public void updateSubject(int id, Student s ){
	        Student s1 = sr.findById(id).orElseThrow(
	                () -> new IllegalStateException("student with id " + id + " not found"));
	        if (s.getStudent_name() != null && !Objects.equals(s1.getStudent_name(), s.getStudent_name()) ) {
	            s1.setStudent_name(s.getStudent_name());
	            
	        }else{
	            throw  new IllegalStateException("invalid name");
	        }
	    }
}
