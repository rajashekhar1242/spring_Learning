package com.spring.JavaConfiguration.PrimaryAndQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class autoWire {
    public static void main(String[] args){
        //configure
        ApplicationContext context=new AnnotationConfigApplicationContext(configJava.class);

        Student stud=context.getBean(Student.class);
        System.out.println(stud.getAge());
        stud.getCom().compile();
    }
}
