//package com.SpringWeb.ModelObject;
//
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@org.springframework.stereotype.Controller
//public class Mcontroller {
//
//    @GetMapping("/calculator")
//    public String calculator(){
//        return "calculator";
//    }
//
//    @GetMapping("/result")
//    public String result(@RequestParam("num1")int n1, @RequestParam("num2")int n2, Model model){
//        int ans=n1+n2;
//        model.addAttribute("ans",ans);
//        return "result";
//    }
//}
