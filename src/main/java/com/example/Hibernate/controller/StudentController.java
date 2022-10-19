package com.example.Hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hibernate.bean.CreateBean;
import com.example.Hibernate.bean.Mibean;
import com.example.Hibernate.entity.Student;
import com.example.Hibernate.entity.Subject;
import com.example.Hibernate.service.StudentService;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
	
	
	@Autowired
	private StudentService ss;
	 
	
	 
	 @Autowired
	 Mibean mb;
	 
	 @GetMapping(path = "/getAlls")
	 @ResponseStatus(HttpStatus.OK)
	    public List<Subject> getSubjects(){

	        return ss.getSubjects();
	 }
	 
	 @GetMapping(path = "/getAll")
	 @ResponseStatus(HttpStatus.OK)
	    public List<Student> getStudents(){

	        return ss.getStudents();
	    }
	 
	 @GetMapping(path = "/getAll2")
	    public ResponseEntity<List<Student>> getStudents2(){
		 ResponseEntity<List<Student>> response = new ResponseEntity<>(ss.getStudents(), HttpStatus.OK);

	        return response;
	    }
	 
	 @PostMapping(path = "/insert")
	 @ResponseStatus(HttpStatus.CREATED)
	    public void insertStudents (@RequestBody Student s){
	        ss.setSubject(s);
	    }
	 
	 @GetMapping(path = "/getById{id}")
	 @ResponseStatus(HttpStatus.OK) 	
	    public Student getById(@PathVariable("id")int id){
	        return ss.getStudentById(id);
	    }
	 
	 @DeleteMapping(path = "/delete{id}")
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void deleteStudent(@PathVariable("id") int id){
	        ss.deleteStudent(id);
	    }

	    @PutMapping(path = "/update{id}")
	    public ResponseEntity<Student> updateSubject(@PathVariable("id")int id, @RequestBody Student s)
	    {
	        ss.updateSubject(id, s);
	        return new ResponseEntity<>(s,HttpStatus.OK);
	    }
	    
	    @GetMapping(path = "/bean")
	    public String getMyBean(){
	    		mb.imprimir();
	        return "completado";
	    }

}

