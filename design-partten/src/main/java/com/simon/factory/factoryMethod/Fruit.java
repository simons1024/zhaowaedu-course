package com.simon.factory.factoryMethod;

public class Fruit {}

class Banana extends Fruit{
    public void produceBanana(){
        System.out.println("香蕉生产中...");
    }
}

class Pear extends Fruit{
    public void producePear(){
        System.out.println("梨子生产中...");
    }
}
