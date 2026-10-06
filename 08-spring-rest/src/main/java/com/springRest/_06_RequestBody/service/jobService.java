package com.springRest._06_RequestBody.service;


import com.springRest._06_RequestBody.model.jobPost;
import com.springRest._06_RequestBody.repo.jobRepo;
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

    public jobPost getJob(int jobPostId) {
        return jobRepo.getJob(jobPostId);
    }
}
