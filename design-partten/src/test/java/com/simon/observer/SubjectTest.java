package com.simon.observer;

import org.junit.jupiter.api.Test;

class SubjectTest {

    @Test
    public void test01(){
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}