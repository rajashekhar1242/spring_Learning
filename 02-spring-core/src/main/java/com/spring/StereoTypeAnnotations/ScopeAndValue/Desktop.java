package com.spring.StereoTypeAnnotations.ScopeAndValue;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Object created");
    }
    public void compile(){
        System.out.println("Desktop Compiling....");
    }
}
