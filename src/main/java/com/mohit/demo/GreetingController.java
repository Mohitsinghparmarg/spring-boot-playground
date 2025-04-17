package com.mohit.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @PostMapping("/greet")
    public GreetingResponse greetUser(@RequestBody GreetingRequest request) {
        String msg =  "Hello, " + request.getName() + "! How are you today?";
        return new GreetingResponse(msg);
    }
}
