package com.spring.RefAttribute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class injection {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

       Student s1=(Student)context.getBean("stud");
       //<property> tag in xml will setValue by setter is triggered after object creation
       s1.code();


    }
}
