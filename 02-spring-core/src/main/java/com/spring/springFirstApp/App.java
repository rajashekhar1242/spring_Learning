package com.spring.springFirstApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

        Developer dev=(Developer) context.getBean("dev");
        dev.code();


    }
}
