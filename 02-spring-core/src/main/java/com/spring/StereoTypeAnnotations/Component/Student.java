package com.spring.StereoTypeAnnotations.Component;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;
    private Laptop lap;

    public Student(){
        System.out.println("Student Object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
