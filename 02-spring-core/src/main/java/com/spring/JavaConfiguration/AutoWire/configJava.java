package com.spring.JavaConfiguration.AutoWire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class configJava {
    @Bean
    public Student student(Laptop lap){
        Student obj=new Student();
        obj.setAge(30);
        obj.setLap(lap);
        return obj;
    }

    @Bean
    //@Scope("prototype")
    public Laptop laptop(){
        return new Laptop();
    }

}
