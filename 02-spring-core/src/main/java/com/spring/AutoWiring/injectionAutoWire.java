package com.spring.AutoWiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class injectionAutoWire {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

       Student s1=(Student)context.getBean("student");

       //AutoWiring byType or byName
       System.out.println(s1.getName());
       s1.getCom().compile();




    }
}
