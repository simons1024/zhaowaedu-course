package com.qt.genericity.bridgemethod;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.Arrays;

class AnimalTest {

    //这个方法用于测试Cat有哪些方法，以便于说明桥接方法
    @Test
    public void test01(){
        Class<Cat> catClass = Cat.class;
        Method[] methods = catClass.getDeclaredMethods();
        for (Method method : methods) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println(name + "(" + Arrays.toString(parameterTypes) + ")");
        }
    }

}