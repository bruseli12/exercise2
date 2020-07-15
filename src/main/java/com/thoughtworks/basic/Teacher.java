package com.thoughtworks.basic;

public class Teacher extends Person {
    public String job;

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;

    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a " + job + ".";
    }

    public void update() {
        System.out.println("My name is " + studentSubject.getName() + ". I am " + studentSubject.getAge() + " years old. I am a Student of Class " + studentSubject.studentClass.getClassNumber() + " Now.");
    }

    public void setOberver(StudentSubject studentSubject) {
        this.studentSubject = studentSubject;
        this.studentSubject.attach(this);
    }

}
