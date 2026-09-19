package com.spring.JavaConfiguration.ScopeAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class configJava {

    @Bean
    @Scope("prototype")
    public Developer dev(){
        return new Developer();
    }

}
