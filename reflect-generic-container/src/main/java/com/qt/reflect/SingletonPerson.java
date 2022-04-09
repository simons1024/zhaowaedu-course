package com.qt.reflect;

public class SingletonPerson {

    private static SingletonPerson person = null;

    public SingletonPerson() {
    }

    public static SingletonPerson getInstance(){
        if (person == null){
            return new SingletonPerson();
        }
        return person;
    }

}
