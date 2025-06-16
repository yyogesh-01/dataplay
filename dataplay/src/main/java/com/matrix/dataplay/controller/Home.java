package com.matrix.dataplay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class Home {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Matrix DataPlay Home API!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running fine!";
    }

    @GetMapping("/info")
    public String info() {
        return "This is a test API for the Home Controller.";
    }
}
