package com.springDataJPA._01_Introduction;

import com.springDataJPA._01_Introduction.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);

		Student s1=context.getBean(Student.class);
		s1.setId(1);
		s1.setName("s1");

		StudentRepo repo=context.getBean(StudentRepo.class);
		repo.save(s1);

	}

}
