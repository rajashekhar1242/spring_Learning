package com.spring.SpringJDBC.usingJavaConfig.Repository;

import com.spring.SpringJDBC.usingJavaConfig.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void execute(Student s) {
        String sql="insert into student(id,name) values(?,?)";

        int r=jdbc.update(sql,s.getId(),s.getName());
        System.out.println(r+" Rows Effected");
    }

    public List<Student> getData(){
        String sql="select * from student";
        List<Student> stud=jdbc.query(sql, (rs, num)->{
            Student s=new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            return s;
        });
        return stud;
    }
}
