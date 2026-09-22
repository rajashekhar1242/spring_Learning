package com.springBoot.DifferentLayers.RepositoryLayer;


import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void getData(){
        System.out.println("laptop data Retrived from database");
    }
}
