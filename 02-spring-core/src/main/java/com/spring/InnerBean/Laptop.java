package com.spring.InnerBean;

import com.spring.GetBeanByType.Computer;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop object created");
    }

    public void compile(){
        System.out.println("Laptop Compiling.....");
    }
}
