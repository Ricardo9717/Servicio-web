package com.example.Hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hibernate.entity.Student;
import com.example.Hibernate.entity.Subject;

@Repository
public interface Subjectrepository extends JpaRepository<Subject, Integer> {

}
