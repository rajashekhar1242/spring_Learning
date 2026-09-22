package com.spring.SpringJDBC.usingJavaConfig;

import com.spring.SpringJDBC.usingJavaConfig.Model.Student;
import com.spring.SpringJDBC.usingJavaConfig.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class javaExecution {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student s1=context.getBean(Student.class);
        s1.setId(12);
        s1.setName("raju");

        StudentService service=context.getBean(StudentService.class);
        service.update(s1);

        List<Student> list=service.getAll();
        System.out.println(list);
    }
}
