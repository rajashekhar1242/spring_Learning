package com.spring.JavaConfiguration.PrimaryAndQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class configJava {
    @Bean
    public Student student(Computer com)//(@Qualifier("desktop") Computer com){};
    {
        Student obj=new Student();
        obj.setAge(30);
        obj.setCom(com);
        return obj;
    }

    @Bean
    @Primary
    public Laptop laptop(){return new Laptop();}

    @Bean
    public Desktop desktop(){return new Desktop();}

}
