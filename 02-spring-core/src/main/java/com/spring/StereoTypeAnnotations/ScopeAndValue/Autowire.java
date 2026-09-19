package com.spring.StereoTypeAnnotations.ScopeAndValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class
Autowire {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);

        //Bean(object) is created for every getBean Cause Of Prototype Scope
        Student s1=context.getBean(Student.class);
        System.out.println(s1.getAge());
        s1.getCom().compile();

        Student s2=context.getBean(Student.class);
        s2.getCom().compile();

        Student s3=context.getBean(Student.class);
        s3.getCom().compile();

    }

}
