package com.mohit.demo;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

@RestController
@Validated
public class GreetingController {

    @PostMapping("/greet")
    public GreetingResponse greetUser(@Valid @RequestBody GreetingRequest request) {
        String msg = "Hello " + request.getName() + "! You are " + request.getAge() + " years old.";
        return new GreetingResponse(msg);
    }
}
