package com.spring.setterInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class injection {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

       Student s1=(Student)context.getBean("student");
       //<property> tag in xml will setValue by setter is triggered after object creation
       System.out.println(s1.getMarks());


    }
}
