package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {
    @Test
    public void testmodeofobserver(){

        Teacher teacher=new Teacher("Matt",32,"Teacher");
        StudentClass studentClass=new StudentClass("2",teacher);
        StudentSubject studentSubject=new StudentSubject("Tom",20,studentClass);
        StudentSubject observer1=new StudentSubject("Jim",20,studentClass,studentSubject);
        teacher.setOberver(studentSubject);
        studentSubject.setName("Mary");
    }
}
