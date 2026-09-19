package com.spring.StereoTypeAnnotations.AutoWired;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public Laptop(){
        System.out.println("Laptop object created");
    }
    public void compile(){
        System.out.println("Laptop Compiling");
    }
}
