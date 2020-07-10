package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void should_return_valueOfintroduce_when_call_introduce_given_new_teacher(){
        //given
        Teacher teacher=new Teacher("Matt",30,"Teacher");
        //when
        String result=teacher.introduce();
        //then
        Assert.assertEquals("My name is Matt. I am 30 years old. I am a Teacher.",result);
    }
}
