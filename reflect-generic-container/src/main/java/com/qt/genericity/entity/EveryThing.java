package com.qt.genericity.entity;

public interface EveryThing {
    void alive();
}

class Animal implements EveryThing{

    public void eat() {}

    public void sleep() {}

    public void alive() {}
}

class Dog extends Animal {

    public void play() {
        System.out.println("Dog play!");
    }
}

class WhiteDog extends Dog {
    public void play() {
        System.out.println("WhiteDog play!");
    }
}

class WhiteCuteDog extends WhiteDog {
    public void play() {
        System.out.println("WhiteCuteDog play!");
    }
}

class Cat extends Animal {

    public void play() {
        System.out.println("Cat play!");
    }
}
