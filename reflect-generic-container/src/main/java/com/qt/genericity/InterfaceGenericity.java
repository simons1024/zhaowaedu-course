package com.qt.genericity;

import org.junit.Test;

/**
 * 把泛型定义在接口上
 * @param <T>
 */
interface Inter<T>{
    void show(T t);
}

/**
 * 把泛型定义在接口上后，其子类实现分两种情况：
 * 1、子类明确泛型类的类型参数变量
 * 2、子类不明确泛型类的类型参数变量，实现类也要定义出T的类型
 */
class InterImpl1 implements Inter<String>{
    public void show(String s) {
        System.out.println(s);
    }
}

/**
 * 见InterImpl1说明
 * @param <T>
 */
class InterImpl2<T> implements Inter<T>{
    public void show(T t) {
        System.out.println(t);
    }
}

public class InterfaceGenericity {

    @Test
    public void test01(){
        InterImpl1 interImpl1 = new InterImpl1();
        //泛型接口的子实现类方式：子类实现接口时明确接口类型
        interImpl1.show("泛型接口的子实现类方式：子类实现接口时明确接口类型");

        //泛型接口的子实现类方式：子类实现接口时不明确接口类型
        //2048.999
        //false
        new InterImpl2<String>().show("泛型接口的子实现类方式：子类实现接口时不明确接口类型");
        InterImpl2<Double> interImpl2 = new InterImpl2<Double>();
        interImpl2.show(2048.999);
        new InterImpl2<Boolean>().show(false);
    }
}
