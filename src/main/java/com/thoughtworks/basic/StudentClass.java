package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    public String classNumber;
    public Teacher teacher;
    public  List students=new ArrayList<Student>() ;

    public StudentClass(String classNumber, Teacher teacher) {
        this.classNumber=classNumber;
        this.teacher=teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
    public String getClassNumber(){
        return classNumber;
    }
    public void addStudent(Student student){
       students.add(student);
    }
}
