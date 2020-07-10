package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;



public class PersonTest {
    @Test
    public void should_return_valueOfintroduce_when_call_introduce_given_new_person(){
        //given
        Person person=new Person("Tom", 21);
        //when
        String result=person.introduce();
        //then
         Assert.assertEquals("My name is Tom. I am 21 years old.",result);
    }

}
