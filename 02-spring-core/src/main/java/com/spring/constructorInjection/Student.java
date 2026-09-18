package com.spring.constructorInjection;

public class Student {
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        System.out.println("Setter executed");
        this.marks = marks;
    }

    Laptop laptop;
    public int marks;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        System.out.println("Laptop Setter executed");
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Student coding.....");
        laptop.compile();
        System.out.println("Marks:"+marks);
    }

    public Student(int marks, Laptop laptop) {
        this.marks = marks;
        this.laptop = laptop;
    }

}
