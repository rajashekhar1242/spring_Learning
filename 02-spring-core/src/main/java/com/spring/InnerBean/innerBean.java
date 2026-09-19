package com.spring.InnerBean;


import com.spring.GetBeanByType.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class innerBean {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

        //laptop object is inner bean of student object
       Student stud=(Student)context.getBean("student");







    }
}
