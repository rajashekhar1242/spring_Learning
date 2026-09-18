package com.spring.objectCreation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class objectCreation
{
    public static void main( String[] args )
    {
        //object will be created when configuration done.
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

//        Developer dev=(Developer) context.getBean("dev");
//        dev.code();


    }
}
