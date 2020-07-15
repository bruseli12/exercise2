package com.thoughtworks.basic;

public abstract class Observer {
    protected StudentSubject  studentSubject;
    public abstract void update();
}
