package com.springRest._04_ReactAndSpring.service;


import com.springRest._04_ReactAndSpring.model.jobPost;
import com.springRest._04_ReactAndSpring.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobService {

    @Autowired
    jobRepo jobRepo;

    public void addJob(jobPost jobPost){
        jobRepo.addJob(jobPost);
    }

    public List<jobPost> getAllJobs(){
        return jobRepo.getJobs();
    }
}
