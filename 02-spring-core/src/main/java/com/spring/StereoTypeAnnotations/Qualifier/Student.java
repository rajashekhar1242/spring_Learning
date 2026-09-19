package com.spring.StereoTypeAnnotations.Qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;
    @Autowired//This is Filed Injection
    @Qualifier("lap")//@Qualifier("desktop")if Class name is Laptop then bean name is laptop or specify bean name
    private Computer com;

    public Student(){
        System.out.println("Student Object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    //@AutoWired For this is called setter Injection and Prefered.
    public void setCom(Computer com) {
        this.com = com;
    }

    //@AutoWired For this is called Constructor Injection
    public Student(Computer c){
        this.com=c;
    }
}
