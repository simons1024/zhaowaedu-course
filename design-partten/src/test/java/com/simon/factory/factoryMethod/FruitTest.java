package com.simon.factory.factoryMethod;
import org.junit.jupiter.api.Test;

class FruitFactoryTest {

    @Test
    public void test01(){
        new BananaFactory().produceBanana();
        new PearFactory().producePear();
    }
}