package com.spring.StereoTypeAnnotations.ScopeAndValue;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    @Value("22")
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
    public void setCom(Computer com) {
        this.com = com;
    }

    //@AutoWired For this is called Constructor Injection
    public Student(Computer c){
        this.com=c;
    }
}
