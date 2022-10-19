package com.example.Hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hibernate.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
