package com.springBoot.DifferentLayers.RepositoryLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repo;

    public Laptop getLaptopService(ApplicationContext context){
        Laptop obj=context.getBean(Laptop.class);
        repo.getData();
        return obj;
    }

    public boolean serviceResult(){
        return true;//if any process happend and Success
    }
}
