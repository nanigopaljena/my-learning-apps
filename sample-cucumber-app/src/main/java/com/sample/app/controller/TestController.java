package com.sample.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-app")
    public String greet() {
        return "My app says 'Ahoy, World!'";
    }
}
