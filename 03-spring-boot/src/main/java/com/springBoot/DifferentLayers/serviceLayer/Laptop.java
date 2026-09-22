package com.springBoot.DifferentLayers.serviceLayer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop{

    public void compile(){
        System.out.println("Laptop compiling...");
    }
}
