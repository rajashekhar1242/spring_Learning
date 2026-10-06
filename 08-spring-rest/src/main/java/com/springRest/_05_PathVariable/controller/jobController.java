package com.springRest._05_PathVariable.controller;


import com.springRest._05_PathVariable.model.jobPost;
import com.springRest._05_PathVariable.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins="https://localhost:3000")
public class jobController {

    @Autowired
    jobService Service;


    @GetMapping("jobPosts")
    public List<jobPost> viewAllJobs(){
        return Service.getAllJobs();
    }

//Accepting using Same name in url  or use @PathVaribale("Id")
//    @GetMapping("jobPost/{jobPostId}")
//    public jobPost viewJob(@PathVariable int jobPostId){
//        return Service.getJob(jobPostId);
//    }



    @GetMapping("jobPost/{Id}")
    public jobPost viewAJob(@PathVariable("Id") int jobPostId){
        return Service.getJob(jobPostId);
    }



}
