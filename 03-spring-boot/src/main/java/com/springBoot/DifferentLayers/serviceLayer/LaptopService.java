package com.springBoot.DifferentLayers.serviceLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public Laptop getLaptopService(ApplicationContext context){
        return context.getBean(Laptop.class);
    }

    public boolean serviceResult(){
        return true;//if any process happend and Success
    }
}
