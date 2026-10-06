package com.springRest._06_RequestBody.controller;


import com.springRest._06_RequestBody.model.jobPost;
import com.springRest._06_RequestBody.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("jobPost/{Id}")
    public jobPost viewAJob(@PathVariable("Id") int jobPostId){
        return Service.getJob(jobPostId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody jobPost post){
        Service.addJob(post);
    }


}
