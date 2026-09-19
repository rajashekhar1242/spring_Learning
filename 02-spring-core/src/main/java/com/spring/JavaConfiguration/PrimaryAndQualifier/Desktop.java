package com.spring.JavaConfiguration.PrimaryAndQualifier;

public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Object created");
    }
    public void compile(){
        System.out.println("Desktop Compiling....");
    }
}
