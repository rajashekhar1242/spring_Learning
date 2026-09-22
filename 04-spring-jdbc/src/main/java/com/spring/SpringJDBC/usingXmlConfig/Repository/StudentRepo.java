package com.spring.SpringJDBC.usingXmlConfig.Repository;

import com.spring.SpringJDBC.usingXmlConfig.Model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentRepo {

      private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

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
        List<Student> stud=jdbc.query(sql, (rs,num)->{
            Student s=new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            return s;
        });
        return stud;
    }
}
