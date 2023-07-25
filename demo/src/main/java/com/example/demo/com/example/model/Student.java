package com.example.demo.com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "std")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int roll;
    String name;

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
