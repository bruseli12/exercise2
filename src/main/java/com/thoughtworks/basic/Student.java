package com.thoughtworks.basic;

public class Student extends Person{
    public String classNumber;


    public Student(String name, int age,String classNumber) {
        super(name, age);
        this.classNumber=classNumber;
    }

    public String introduce(){
         return "My name is "+name+". I am "+age+" years old. I am a Student of Class "+classNumber+".";
    }
}
