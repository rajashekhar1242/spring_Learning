package com.springDataJPA._02_CrudOperations._02_findAll_findById;


import com.springDataJPA._02_CrudOperations._02_findAll_findById.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
