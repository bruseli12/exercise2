package com.thoughtworks.basic;

public class Teacher extends Person{
    public String job;
    public Teacher(String name,int age,String job){
        super(name,age);
        this.job=job;
    }
    public String introduce(){
        return "My name is "+name+". I am "+age+" years old. I am a "+job+".";
    }

}
