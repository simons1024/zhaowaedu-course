package com.qt.genericity.bridgemethod;

public interface Animal<T> {
    void eat(T t);
}

class Cat implements Animal<String> {
    @Override
    public void eat(String s) {
        System.out.println("cat eat  " + s);
    }
}