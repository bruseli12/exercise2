package com.thoughtworks.basic;


import java.util.ArrayList;
import java.util.List;

public class StudentSubject extends Person {
    public StudentClass studentClass;
    public List<Observer> observers = new ArrayList<Observer>();


    public StudentSubject(String name, int age, StudentClass studentClass, StudentSubject studentSubject) {
        super(name, age);
        this.studentClass = studentClass;
        this.studentSubject = studentSubject;
        this.studentSubject.attach(this);
    }


    public StudentSubject(String name, int age, StudentClass studentClass) {
        super(name, age);
        this.studentClass = studentClass;

    }

    public void setName(String name) {
        if (this.name != name) {
            this.name = name;
            notifyAllObservers();
        }
    }

    public void setStudentClass(String classNumber) {
        if (this.studentClass.getClassNumber() != classNumber) {
            this.studentClass.setClassNumber(classNumber);
            notifyAllObservers();
        }
    }

    public void notifyAllObservers() {
        for (Observer observer : observers)
            observer.update();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void update() {
        System.out.println("My name is " + studentSubject.getName() + ". I am " + studentSubject.getAge() + " years old. I am a Student of Class " + studentSubject.studentClass.getClassNumber() + " Now.");
    }
}
