package com.qt.reflect;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class PersonTest {

    /**获取Class对象的3种方式：
     * 方式一，类名.class
     * 方式二，实例.getClass()
     * 方式三，Class.forName("类的全路径");
     */
    @Test
    public void test01() throws Exception{
        Class<Person> personClass1 = Person.class;
        Class personClass2 = new Person().getClass();
        Class personClass3 = Class.forName("com.qt.reflect.Person");
        System.out.println(personClass1 == personClass2 ?
                (personClass1 == personClass3) : false);  //true
    }

    /**获取实例对象
     * 1、获取类对象
     * 2、获得构造器
     * 3、通过构造器获得实例对象
     */
    @Test
    public void test02()throws Exception{
        Class personClass = Class.forName("com.qt.reflect.Person");
        Constructor personNoConstructor = personClass.getConstructor();
        Constructor personAllConstructor = personClass.getConstructor(String.class, Integer.class, Byte.class, Boolean.class);
        Person person1 = (Person) personNoConstructor.newInstance();
        Person person2 = (Person) personAllConstructor.newInstance("com/qt2", 10, (byte)1, false);

        person1.setName("com/qtqt1");

        //person1=Person{name='com/qtqt1', age=1, gender=1, isMarried=false}
        //person2=Person{name='com/qt2', age=10, gender=1, isMarried=false}
        System.out.println("person1=" + person1);
        System.out.println("person2=" + person2);
    }

    //获得公有成员，以公有属性为例
    @Test
    public void test03() throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();

        Field nameField = personClass.getField("name");
        String name = String.valueOf(nameField.get(person));
        System.out.println("name:" + name);  //name:com/qt
    }

    //获得非公有成员，以私有属性为例
    @Test
    public void test04() throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();

        Field genderField = personClass.getDeclaredField("gender");
        genderField.setAccessible(true);
        System.out.println(genderField.get(person));    //1
    }


}