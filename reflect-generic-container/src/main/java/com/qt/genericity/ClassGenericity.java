package com.qt.genericity;

import org.junit.Test;

public class ClassGenericity {

    /**
     * 构建可以存储任何对象的工具类
     */
    static class ObjectTool<T>{
        private T obj;

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }

    //泛型类的用法：创建对象时就指定对象的具体类型
    @Test
    public void test01(){
        ObjectTool<String> stringObjectTool = new ObjectTool<String>();
        stringObjectTool.setObj("Smith");
        System.out.println(stringObjectTool.getObj());  //Smith

        ObjectTool<Integer> integerObjectTool = new ObjectTool<Integer>();
        integerObjectTool.setObj(1024);
        System.out.println(integerObjectTool.getObj()); //1024
    }
}
