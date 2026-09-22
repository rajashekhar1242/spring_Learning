package com.springBoot.PrimaryAndQualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class primaryAndQualifier {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(primaryAndQualifier.class, args);
		Student s1=context.getBean(Student.class);
		s1.getCom().compile();
	}

}
