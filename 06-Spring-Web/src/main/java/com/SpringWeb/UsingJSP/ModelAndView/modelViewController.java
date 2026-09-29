package com.SpringWeb.UsingJSP.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class modelViewController {

        @GetMapping("/cal")
        public String calculator(){
            return "calculator";
        }

        @GetMapping("/add")
        public ModelAndView add(int num1,int num2, ModelAndView mv) {
            int ans = num1 + num2;
            mv.addObject("ans", ans);
            mv.setViewName("result");
            return mv;
        }

}
