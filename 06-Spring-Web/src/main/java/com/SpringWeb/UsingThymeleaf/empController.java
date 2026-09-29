package com.SpringWeb.UsingThymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class empController {

    @ModelAttribute("course")
    public String setCourse(){
        return "full-stack";
    }

    @RequestMapping("empHome")
    public String emp(){
        return "home";
    }

    @RequestMapping("display")
    //public String display(@ModelAttribute("e1") emp e1) explicitly naming
    public String display(emp e1) //Spring Automatically recognize objects as ModelAttribute
    {
        return "result";
    }

}
