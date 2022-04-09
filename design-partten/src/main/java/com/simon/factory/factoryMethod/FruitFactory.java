package com.simon.factory.factoryMethod;

public interface FruitFactory {}

class BananaFactory implements FruitFactory{
    public Banana produceBanana(){
        Banana banana = new Banana();
        banana.produceBanana();
        return banana;
    }
}

class PearFactory implements FruitFactory{
    public Pear producePear(){
        Pear pear = new Pear();
        pear.producePear();
        return pear;
    }
}
