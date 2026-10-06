package com.springRest._07_PutAndDelete.service;


import com.springRest._07_PutAndDelete.model.jobPost;
import com.springRest._07_PutAndDelete.repo.jobRepo;
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

    public  void updateJob(jobPost post) {
       jobRepo.updateJob(post);
    }

    public void deleteJob(int id) {
        jobRepo.deleteJob(id);
    }
}
