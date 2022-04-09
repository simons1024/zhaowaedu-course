package com.simon.factory.simpleFactory;
import org.junit.jupiter.api.Test;

//客户想吃什么水果，工厂就可以生产出什么水果
class FruitFactoryTest {

    @Test
    public void test01(){
        FruitFactory fruitFactory = new FruitFactory();
        FruitImpl1 banana = (FruitImpl1) fruitFactory.produceFruit("banana");
        banana.produceBanana();
        FruitImpl2 pear = (FruitImpl2) fruitFactory.produceFruit("pear");
        pear.producePear();
    }
}