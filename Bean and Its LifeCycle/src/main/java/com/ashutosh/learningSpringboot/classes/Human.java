package com.ashutosh.learningSpringboot.classes;

// Case when there a parameterized constructor - we create its object using @Bean annotation

public class Human {
    public String gender;
    public int age;
    public Human(String gender, int age) {
        this.gender = gender;
        this.age = age;
        System.out.println("Human object is initialized.");
    }
}
