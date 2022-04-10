package com.qt.genericity;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 类型通配符
 */
public class TypeWildcard {

    private final static List<Integer> INTEGER_LIST = Lists.newArrayList(1, 2, 3, 4);

//    private final static List<Object> OBJECT_LIST = Lists.newArrayList("a",1,'c',6.0F,true);
    private final static List<Object> OBJECT_LIST = Lists.newArrayList();

    private final static List<String> STRING_LIST = Lists.newArrayList("x", "y", "z");

    public static void main(String[] args) {
        TypeWildcard typeWildcard = new TypeWildcard();
        System.out.println("------------test1-------------");
        typeWildcard.test1(INTEGER_LIST);

        System.out.println("\n------------test2-------------");
        // typeWildcard.test2(INTEGER_LIST);
        typeWildcard.test2(OBJECT_LIST);

        System.out.println("\n------------test3-------------");
        typeWildcard.test3(INTEGER_LIST);
        typeWildcard.test3(OBJECT_LIST);
        typeWildcard.test3(STRING_LIST);

        System.out.println("\n------------test4 end-------------");
        typeWildcard.test4(INTEGER_LIST);
        typeWildcard.test4(OBJECT_LIST);
        typeWildcard.test4(STRING_LIST);

        /** 上限通配符 */
        System.out.println("\n------------test5 end-------------");
        typeWildcard.test5(INTEGER_LIST);

        /** 下限通配符 */
        System.out.println("\n------------test6 end-------------");
        // typeWildcard.test6(INTEGER_LIST); // 编译错误
    }

    public void test1(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void test2(List<Object> list) { // List<Object> 和 Object
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public <T> void test3(List<T> list) {
        list.add(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void test4(List<?> list) {
        // list.add(list.get(0)); // 编译错误
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void test5(List<? extends Number> list) {
        // list.add(list.get(0)); // 编译错误
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void test6(List<? super Number> list) {
        // list.add(list.get(0)); // 编译错误
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}


