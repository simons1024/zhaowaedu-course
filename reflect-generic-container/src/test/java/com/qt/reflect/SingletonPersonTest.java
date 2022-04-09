package com.qt.reflect;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;

class SingletonPersonTest {

    //演示暴力破解单例模式，通过私有构造器创建类的对象
    @Test
    public void test01() throws Exception{
        Class singletonPersonClass = SingletonPerson.class;
        Constructor constructor = singletonPersonClass.getDeclaredConstructor();

        //有资格操纵Class文件的非共有成员
        constructor.setAccessible(true);

        SingletonPerson singletonPerson1 = (SingletonPerson) constructor.newInstance();
        SingletonPerson singletonPerson2 = SingletonPerson.getInstance();
        SingletonPerson singletonPerson3 = SingletonPerson.getInstance();

        //singletonPerson1==singletonPerson2 is false
        //singletonPerson1==singletonPerson3 is false
        //singletonPerson2==singletonPerson3 is false
        System.out.println("singletonPerson1==singletonPerson2 is " + (singletonPerson1 == singletonPerson2));
        System.out.println("singletonPerson1==singletonPerson3 is " + (singletonPerson1 == singletonPerson3));
        System.out.println("singletonPerson2==singletonPerson3 is " + (singletonPerson2 == singletonPerson3));
    }
}