package com.simon.decortor;

import org.junit.jupiter.api.Test;

class ComponentTest {

    @Test
    public void test01(){
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}