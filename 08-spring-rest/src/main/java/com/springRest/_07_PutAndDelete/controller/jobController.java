package com.springRest._07_PutAndDelete.controller;


import com.springRest._07_PutAndDelete.model.jobPost;
import com.springRest._07_PutAndDelete.service.jobService;
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
    public jobPost addJob(@RequestBody jobPost post){
        Service.addJob(post);
        return Service.getJob(post.getPostId());
    }

    @PutMapping("jobPost")
    public void updateJob(@RequestBody jobPost post){
        Service.updateJob(post);

    }

    @DeleteMapping("jobPost/{id}")
    public String deleteJob(@PathVariable int id){
        Service.deleteJob(id);
        return "Deleted";
    }




}
