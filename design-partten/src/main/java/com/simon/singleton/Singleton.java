package com.simon.singleton;

/**
 * 单例模式创建步骤：
 * 1、构造器私有
 * 2.自己创建单例
 * 3.外界调用单例
 */
public class Singleton {
}

/**
 * 饿汉式，该模式的特点是类一旦加载就创建一个单例，
 * 保证在调用 getInstance 方法之前单例已经存在了
 */
class SingletonHunger{
    private static SingletonHunger instance = new SingletonHunger();
    private SingletonHunger() {}

    public static SingletonHunger getInstance(){
        return instance;
    }
}

/**
 * 懒汉式,该模式的特点是类加载时没有生成单例，
 * 只有当第一次调用 getlnstance 方法时才去创建这个单例
 */
class SingletonLazy{
    private SingletonLazy() {}

    private static class Holder{
        private static final SingletonLazy singleton_lazy = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return Holder.singleton_lazy;
    }
}

/**
 * 线程安全的、带有双重检查锁的单例模式
 * 这里需要注意：
 * 1、volatile关键字在本实例中的作用（这里最好对JMM要非常熟悉）
 * 2、为什么要双重检查null（需要解释每一层null的作用）
 */
class SingletonA{
    private volatile static SingletonA uniqueSingleton;
    private SingletonA() {}

    public SingletonA getInstance(){
        if (null == uniqueSingleton){
            synchronized (SingletonA.class){
                if (null == uniqueSingleton){
                    //对问题1的回答：
                    //通常情况下，系统编译优化时会将这行new SingletonA()代码优化，也就是指令重排：
                    //memory = allocate();    //1：分配对象的内存空间
                    //initInstance(memory);   //2：初始化对象
                    //instance = memory;      //3：设置instance指向刚分配的内存地址
                    //所以用到了关键字volatile，用户就不会得到没有完成初始化的“半个”单例
                    uniqueSingleton = new SingletonA();
                    //对问题2的回答：
                    //如果没有第二层null，单例模式就名存实亡，失去了意义
                    //如果没有第一层null，性能问题。第一道防线，使得那些不为null的实例连抢占锁的资格都没有，
                    //并且synchronized (SingletonA.class)只需要执行一次锁定操作以实现线程同步。
                }
            }
        }
        return uniqueSingleton;
    }
}