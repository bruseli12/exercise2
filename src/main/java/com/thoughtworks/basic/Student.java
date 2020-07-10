package com.thoughtworks.basic;

public class Student extends Person{
    public StudentClass studentClass;


    public Student(String name, int age,StudentClass studentClass) {
        super(name, age);
        this.studentClass=studentClass;
        joinClass();

    }

    public String introduce(){
         return "My name is "+name+". I am "+age+" years old. I am a Student of Class "+studentClass.getClassNumber()+". My teacher is "+studentClass.getTeacher().getName()+".";
    }
    public void joinClass(){
        studentClass.addStudent(this);
    }
}
