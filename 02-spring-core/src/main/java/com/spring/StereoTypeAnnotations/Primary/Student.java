package com.spring.StereoTypeAnnotations.Primary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;
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
    @Autowired
    @Qualifier("desktop")//Even if primary bean in laptop we get desktop Cause of Qualifier
    public void setCom(Computer com) {
        this.com = com;
    }

    //@AutoWired For this is called Constructor Injection
    public Student(Computer c){
        this.com=c;
    }
}
