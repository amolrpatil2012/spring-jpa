package com.example.demo.com.example.repository;

import com.example.demo.com.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
