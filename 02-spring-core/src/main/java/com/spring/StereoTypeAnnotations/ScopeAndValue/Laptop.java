package com.spring.StereoTypeAnnotations.ScopeAndValue;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements Computer {

    //public Laptop(){System.out.println("Laptop object created");   }
    public void compile(){
        System.out.println("Laptop Compiling");
    }
}
