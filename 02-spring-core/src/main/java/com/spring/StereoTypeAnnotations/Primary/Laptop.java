package com.spring.StereoTypeAnnotations.Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lap")
@Primary
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop object created");
    }
    public void compile(){
        System.out.println("Laptop Compiling");
    }
}
