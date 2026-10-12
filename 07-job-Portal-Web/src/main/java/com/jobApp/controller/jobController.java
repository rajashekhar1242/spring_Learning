package com.jobApp.controller;

import com.jobApp.model.jobPost;
import com.jobApp.repo.jobRepo;
import com.jobApp.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class jobController {

    @Autowired
    jobService Service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(jobPost jobPost){
        Service.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model){
        List<jobPost> jobs=Service.getAllJobs();
        model.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
