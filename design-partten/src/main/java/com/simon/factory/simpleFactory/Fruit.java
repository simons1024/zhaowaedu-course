package com.simon.factory.simpleFactory;

//水果有多种类型
public class Fruit {}

class FruitImpl1 extends Fruit {
    public void produceBanana(){
        System.out.println("香蕉生产中。。。");
    }
}

class FruitImpl2 extends Fruit {
    public void producePear(){
        System.out.println("梨子生产中。。。");
    }
}