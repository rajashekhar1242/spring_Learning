package com.spring.JavaConfiguration.BeanNaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configJava {

    @Bean(name={"dev","dev1","dev2"})
    public Developer developer(){
        return new Developer();
    }

}
