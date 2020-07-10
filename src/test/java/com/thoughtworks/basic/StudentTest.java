package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest{
    @Test
    public void should_return_valueOfintroduce_when_call_introduce_given_new_student(){
        //given
        Student student=new Student("Tom",21,"2");
        //when
        String result=student.introduce();
        //then
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a Student of Class 2.",result);
    }
}
