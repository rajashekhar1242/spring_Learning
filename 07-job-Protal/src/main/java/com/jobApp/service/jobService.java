package com.jobApp.service;

import com.jobApp.model.jobPost;
import com.jobApp.repo.jobRepo;
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
