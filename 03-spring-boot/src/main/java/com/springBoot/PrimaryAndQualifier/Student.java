package com.springBoot.PrimaryAndQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    @Autowired //setter injection
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
