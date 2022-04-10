package com.qt.container;

import java.util.ArrayList;

/**
 * 1.   创建ArrayList对象时，元素数据为空，默认容量空元素数据也为空。
 * 同时，元素数据是被transient关键字修饰，这是因为序列化和反序列化过程能尽可能节约空间，灵活使用内存。
 *
 * 2.   添加集合第一个元素时，首先确定是否需要扩容。如果需要则调用ensureCapacityInternal(int minCapacity)进行扩容；
 * 如果不需要扩容，就直接跳过这一步，将元素放入元素数据缓存组中，并将ArrayList中包含的元素数量+1，返回true；
 * 如果需要扩容，调用calculateCapacity(elementData, minCapacity)来计算元素数据缓存组与最小容量的大小做比较，取较大值。
 * 这个过程中，如果元素数组缓存组大小为空，则将DEFAULT_CAPACITY=10 的大小赋值给这个元素数据缓存组。
 * 计算的目的是为了估算所需容量。接着就需要真正为这个缓存组分配空间大小了。
 * 分配空间就是调用ensureExplicitCapacity(int minCapacity)，其扩容机制是原来的1.5倍，用了老容量+老容量右移1位的方式。
 * 因此，添加第一个元素的过程就是先估算最小容量，再按照容量的1.5倍分配实际内存大小。
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
