package com.springDataJPA._02_CrudOperations._01_CreateAndInstert;

import com.springDataJPA._02_CrudOperations._01_CreateAndInstert.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);

		Student s1=context.getBean(Student.class);
		s1.setId(101);
		s1.setName("s1");

		Student s2=context.getBean(Student.class);
		s2.setId(102);
		s2.setName("s2");

		Student s3=context.getBean(Student.class);
		s3.setId(104);
		s3.setName("s3");

		StudentRepo repo=context.getBean(StudentRepo.class);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

	}

}
