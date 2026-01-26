package com.ashutosh.learningSpringboot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


// Case when there a default constructor - we create its object using @Component annotation

@Component
public class User {
    public String name;
    public int age;

    @Autowired
    Human human;

    public User() {
        System.out.println("User object is initialized.");
    }

    @PostConstruct
    public void postUserInitMethod() {
        System.out.println("User's post init method is called.");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("User's pre destroy method is called.");
    }

    // public User(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }
}
