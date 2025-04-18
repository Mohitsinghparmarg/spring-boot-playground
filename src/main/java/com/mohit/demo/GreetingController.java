package com.mohit.demo;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/greet")
    public GreetingResponse greetUser(@Valid @RequestBody GreetingRequest request) {
        String msg = greetingService.generateGreeting(request.getName(), request.getAge());
        return new GreetingResponse(msg);
    }
}
