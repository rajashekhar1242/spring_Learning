package com.spring.InnerBean;

import com.spring.GetBeanByType.Computer;

public class Student {
    public Student(){
        System.out.println("Student object created");
    }
    private String name;
    private Computer com;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


}
