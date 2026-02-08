package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController { 
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PreAuthorize("hasRole('ADMIN')") // This method can only be accessed by users with the "ADMIN" role
    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello Admin";
    }

    @PreAuthorize("hasRole('USER')") // This method can only be accessed by users with the "USER" role
    @GetMapping("/user")
    public String helloUser(){
        return "Hello User";
    }
}
