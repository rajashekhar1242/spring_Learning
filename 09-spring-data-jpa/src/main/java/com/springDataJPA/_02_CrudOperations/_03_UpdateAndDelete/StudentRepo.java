package com.springDataJPA._02_CrudOperations._03_UpdateAndDelete;


import com.springDataJPA._02_CrudOperations._03_UpdateAndDelete.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
