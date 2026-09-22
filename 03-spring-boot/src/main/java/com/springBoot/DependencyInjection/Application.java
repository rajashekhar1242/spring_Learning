package com.springBoot.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Application.class, args);
		Student s1=context.getBean(Student.class);
		s1.getLap().compile();
	}

}
