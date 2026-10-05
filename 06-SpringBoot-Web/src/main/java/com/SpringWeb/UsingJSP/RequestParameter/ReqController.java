//package com.SpringWeb.RequestParameter;
//
//
//import jakarta.servlet.http.HttpSession;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class ReqController {
//
//    @GetMapping("/cal")
//    public String calculator(){
//        return "calculator";
//    }
//
//    @GetMapping("/add")
//    public String add(@RequestParam("num1")int n1,@RequestParam("num2")int n2, HttpSession session){
//        int result=n1+n2;
//        session.setAttribute("result",result);
//        return "result";
//    }
//}
