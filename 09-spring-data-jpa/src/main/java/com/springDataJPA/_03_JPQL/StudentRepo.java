package com.springDataJPA._03_JPQL;


import com.springDataJPA._03_JPQL.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


    //using a query
//    @Query("select s from Student s where s.name=?1")
//    List<Student> findByName(String name);

    //using jpa domain specific Lang
    List<Student> findByAge(int age);

    List<Student> findByAgeGreaterThan(int age);
    List<Student> findByAgeLessThan(int age);

}
