package com.example.demo.com.example.controller;

import com.example.demo.com.example.model.Student;
import com.example.demo.com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    public  void save ( Student student )
    {

        studentRepository.save(student);

    }
}
