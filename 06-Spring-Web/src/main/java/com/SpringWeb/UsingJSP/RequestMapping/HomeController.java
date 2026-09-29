package com.SpringWeb.UsingJSP.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        System.out.println("in home method called");
        //returning a page(jsp view) converted into servlet
        return "index";
    }


}
