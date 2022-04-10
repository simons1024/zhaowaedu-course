package com.qt.genericity;

import org.junit.Test;

public class MethodGenericity {

    static class ObjectTool{
        public <T> void show(T t){
            System.out.println(t);
        }
    }

    //泛型方法的用法：对象调用方法时才指定传入的具体类型
    @Test
    public void test01(){
        ObjectTool objectTool = new ObjectTool();
        objectTool.show(2048);  //2048
        objectTool.show("wonderful day");   //wonderful day
    }
}
