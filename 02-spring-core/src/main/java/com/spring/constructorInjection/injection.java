package com.spring.constructorInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class injection {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

       Student s1=(Student)context.getBean("student");
       // <Constructor-arg [type or index or name] [value or ref] />
       s1.code();


    }
}
