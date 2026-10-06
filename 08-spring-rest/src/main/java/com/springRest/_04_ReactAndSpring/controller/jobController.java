package com.springRest._04_ReactAndSpring.controller;


import com.springRest._04_ReactAndSpring.model.jobPost;
import com.springRest._04_ReactAndSpring.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins="https://localhost:3000")
public class jobController {

    @Autowired
    jobService Service;


    @GetMapping("/jobPosts")
    public List<jobPost> viewAllJobs(){
        return Service.getAllJobs();
    }

}
