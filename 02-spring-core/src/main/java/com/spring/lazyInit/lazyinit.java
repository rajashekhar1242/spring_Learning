package com.spring.lazyInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lazyinit {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("springcfg.xml");

        //lap object is not created if excuted it creates
        //Desktop lap=(Desktop)context.getBean("lap");


    }
}
