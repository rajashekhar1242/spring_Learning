package com.springDataJPA._02_CrudOperations._03_UpdateAndDelete;

import com.springDataJPA._02_CrudOperations._03_UpdateAndDelete.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);

		//Id Changed That will reflect  in table
		Student s3=context.getBean(Student.class);
		s3.setId(107);
		s3.setName("student3");

		StudentRepo repo=context.getBean(StudentRepo.class);

		//save() can be used for update or delete
		repo.save(s3);

		//delete() can be used to delete
		repo.delete(s3);




	}

}
