package com.ashutosh.learningSpringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.ashutosh.learningSpringboot.classes.Human;

@Configuration
public class AppConfig {
    @Bean
    @Lazy
    public Human createHumanBean(){
        return new Human("male", 10);
    }

}
