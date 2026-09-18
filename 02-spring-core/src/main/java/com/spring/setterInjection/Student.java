package com.spring.setterInjection;

public class Student {
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        System.out.println("Setter executed");
        this.marks = marks;
    }

    public int marks;

    public Student(){
        System.out.println("Student Object Created");
    }

}
