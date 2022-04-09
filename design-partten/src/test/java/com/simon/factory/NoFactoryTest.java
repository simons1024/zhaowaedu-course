package com.simon.factory;
import org.junit.jupiter.api.Test;

class NoFactoryTest {

    @Test
    public void test01(){
        NoFactory noFactory = new NoFactory();
        NoFactory.Banana banana = noFactory.new Banana();
        NoFactory.Pear pear = noFactory.new Pear();
        banana.produceBanana();
        pear.producePear();
    }
}