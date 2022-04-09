package com.qt.reflect;

import org.junit.Test;
import java.lang.reflect.Field;

//本类用以复制两个对象具有相同属性的值
public class BeanUtils {
    public static void copyProperties(Object origin,Object target) throws Exception{
        Class originClass = origin.getClass();
        Class targetClass = target.getClass();

        Field[] originFields = originClass.getDeclaredFields();
        Field[] targetFields = targetClass.getDeclaredFields();
        for (Field originField : originFields) {
            for (Field targetField : targetFields) {
                if (originField.getName().equals(targetField.getName())){
                    originField.setAccessible(true);
                    targetField.setAccessible(true);
                    targetField.set(target,originField.get(origin));
                }
            }
        }
    }

    @Test
    public void testUtils() throws Exception{
        Person person = new Person();
        Person1 person1 = new Person1();
        System.out.println(person);
        System.out.println(person1);
        BeanUtils.copyProperties(person,person1);
        System.out.println(person);
        System.out.println(person1);
    }
}
