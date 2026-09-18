package com.spring.objectCreation.scopeOfObject;

import com.spring.objectCreation.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scope {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("springcfg.xml");

        //prototype Scope object will only create when used getBeans(id);
        Student student=(Student)context.getBean("studentOne");
        student.marks=50;
        System.out.println(student.marks);//result 50

        Student student2=(Student)context.getBean("studentOne");
        System.out.println(student2.marks); //resutls 0 cause new object if singelton marks=50

    }
}
