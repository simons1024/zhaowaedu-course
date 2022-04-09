package com.simon.command;
import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    public void test01(){
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        System.out.println("客户访问调用者的call()方法");
        invoker.call();
    }
}