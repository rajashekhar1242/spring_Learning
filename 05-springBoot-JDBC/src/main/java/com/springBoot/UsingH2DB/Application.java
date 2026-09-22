package com.springBoot.UsingH2DB;

import com.springBoot.UsingH2DB.Model.Student;
import com.springBoot.UsingH2DB.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Application.class, args);

		Student s1=context.getBean(Student.class);
		s1.setId(4);
		s1.setName("E");

		StudentService service=context.getBean(StudentService.class);
		service.update(s1);

		List<Student> list=service.getAll();
		System.out.println(list);
	}

}
