package com.spring.JavaConfiguration.BeanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configJava {

    @Bean
    public Developer dev(){
        return new Developer();
    }

}
