package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class StudengClassTest {
    @Test
    public void should_return_valueOfintroduce_when_call_introduce_given_new_studentclass(){
        //given
        Teacher teacher=new Teacher("Matt",32,"Teacher");
        StudentClass studentClass=new StudentClass("2",teacher);
        Student student=new Student("Tom",21,studentClass);
        //when
        String result=student.introduce();

        //then
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a Student of Class 2." + " My teacher is Matt.",result);
    }
}
