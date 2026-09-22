package com.springBoot.DifferentLayers.RepositoryLayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class controller {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(controller.class, args);

		//Get laptop from service class
		LaptopService service=context.getBean(LaptopService.class);

		Laptop laptop= service.getLaptopService(context);
		laptop.compile();

	}

}
