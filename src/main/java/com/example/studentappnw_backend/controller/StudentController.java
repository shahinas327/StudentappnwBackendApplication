package com.example.studentappnw_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "welcpome to my website";
    }
    @GetMapping("/contact")
    public String Contact()
    {
        return "welcome to contact page";
    }
}
