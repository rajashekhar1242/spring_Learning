package com.spring.SpringJDBC.usingJavaConfig.Service;

import com.spring.SpringJDBC.usingJavaConfig.Model.Student;
import com.spring.SpringJDBC.usingJavaConfig.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void update(Student s){
        repo.execute(s);

    }

    public List<Student> getAll(){
       return repo.getData();
    }
}
