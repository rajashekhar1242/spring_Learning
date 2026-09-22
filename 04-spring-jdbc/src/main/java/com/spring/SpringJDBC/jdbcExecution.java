package com.spring.SpringJDBC;


import com.spring.SpringJDBC.usingXmlConfig.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.SpringJDBC.usingXmlConfig.Model.Student;
import java.util.*;

public class jdbcExecution {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Student stud =context.getBean(Student.class);
        stud.setId(8);
        stud.setName("R");

        StudentService service=context.getBean(StudentService.class);
        service.update(stud);


       List<Student> students=service.getAll();
       System.out.println(students);


    }
}
