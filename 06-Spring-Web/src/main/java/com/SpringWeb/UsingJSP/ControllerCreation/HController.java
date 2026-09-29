package com.SpringWeb.UsingJSP.ControllerCreation;

import org.springframework.stereotype.Controller;

@Controller
public class HController {

    public String h(){
        //returning a page(jsp view) converted into servlet
        return "index";
    }
}
