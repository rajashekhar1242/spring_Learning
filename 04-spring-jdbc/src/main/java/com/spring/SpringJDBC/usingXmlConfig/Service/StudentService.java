package com.spring.SpringJDBC.usingXmlConfig.Service;

import com.spring.SpringJDBC.usingXmlConfig.Model.Student;
import com.spring.SpringJDBC.usingXmlConfig.Repository.StudentRepo;

import java.util.List;

public class StudentService {

    public StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

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
