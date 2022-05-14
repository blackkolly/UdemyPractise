package com.company.practise.school;

public class Student {
    String name;
    int studId;
    String dept;

    public Student(String name, int studId, String dept) {
        this.name = name;
        this.studId = studId;
        this.dept = dept;
    }

    public void updateProfile(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Student student1 = new Student("kola",23,"electrical");
        System.out.println(student1.name);
        student1.updateProfile("mike");
        Student student2 = student1;
        System.out.println(student2.name);

    }


}
