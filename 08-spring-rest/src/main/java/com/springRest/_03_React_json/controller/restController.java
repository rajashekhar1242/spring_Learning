package com.springRest._03_React_json.controller;


import com.springRest._03_React_json.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class restController {

    @Autowired
    student student;

    public void setData(){
        student.setName("Raju");
        student.setAge(23);

    }

    @GetMapping("/student")
    public student getStudent(){
        setData();
        return student;
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


