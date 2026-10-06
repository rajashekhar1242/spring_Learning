package com.springRest._02_httpMethods.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class restController {

    @GetMapping("/student")
    public String getStudent(){
        return "All Students data";
    }

    @PostMapping("/student")
    public String postStudent(){
        return "Students data Added";
    }

    @PutMapping("/student")
    public String putStudent(){
        return "Students data Updated";
    }

    @DeleteMapping("/student")
    public String deleteStudent(){
        return "Students data Deleted";
    }
}


