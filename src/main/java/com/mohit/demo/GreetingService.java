package com.mohit.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String generateGreeting(String name, int age) {
        return "Hello " + name + "! You are " + age + " years old.";
    }
}
