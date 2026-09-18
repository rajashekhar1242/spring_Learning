package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    Laptop laptop;

    @Autowired
    void Developer(Laptop lap){
        this.laptop=lap;
    }

    public void code(){
        laptop.compile();
    }
}
