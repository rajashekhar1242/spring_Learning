package com.springDataJPA._02_CrudOperations._02_findAll_findById;

import com.springDataJPA._02_CrudOperations._02_findAll_findById.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

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

		repo.findAll().forEach(System.out::println);


		//findbyId() return Optional<T> -> java 8 concept to handle when null values
		Optional<Student> s=repo.findById(105);
		System.out.println(s.orElse(new Student()));



	}

}
