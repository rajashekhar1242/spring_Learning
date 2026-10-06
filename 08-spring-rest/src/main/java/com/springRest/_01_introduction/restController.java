package com.springRest._01_introduction;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/index")
    public String index(){
        return "Hello World";
    }
}


//Tradition way expects the mapping to return a view(jsp,thymeleaf etc...)
//@Controller
//public class controller{
//
//    @GetMapping("/index")
//    public String index(){
//        return "index.jsp";//view
//    }
//}

