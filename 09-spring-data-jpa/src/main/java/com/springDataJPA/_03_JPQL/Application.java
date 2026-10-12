package com.springDataJPA._03_JPQL;

import com.springDataJPA._03_JPQL.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

	 static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

		IO.println(repo.findByAge(25));

		IO.println(repo.findByAgeGreaterThan(24));
		IO.println(repo.findByAgeLessThan(25));


	}

}
