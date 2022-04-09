package com.simon.factory.abstractFactory;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    public void test01(){
        BananaFactory bananaFactory = new BananaFactory();
        bananaFactory.produceColor();
        bananaFactory.produceWeight();

        System.out.println("-----------------");

        AppleFactory appleFactory = new AppleFactory();
        appleFactory.produceColor();
        appleFactory.produceWeight();
    }
}