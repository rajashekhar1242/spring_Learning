package com.spring.GetBeanByType;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanByType {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

        //getBean (name,byType)
        Laptop laptop=context.getBean("lap",Laptop.class);

        //getBean (name) also we can create bean without id
        Desktop desktop=context.getBean(Desktop.class);

        Desktop desktop1=context.getBean(Desktop.class);

        //if same type beans are created it will result in error
        //can be resolved using primary or use getBean(name.Type)







    }
}
