package com.simon.proxy.dynamicProxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class JDKDynamicProxyTest {
    /**
     * 下列代码的关键是Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
     * InvocationHandler handler)方法，该方法会根据指定的参数动态创建代理对象。三个参数的意义如下：
     * 1. loader，指定代理对象的类加载器；
     * 2. interfaces，代理对象需要实现的接口，可以同时指定多个接口；
     * 3. handler，方法调用的实际处理者，代理对象的方法调用都会转发到这里（*注意1）。
     */
    @Test
    public void test01(){
        JDKSubject jdkRealSubject = new JDKRealSubject();
        JDKDynamicProxy proxy = new JDKDynamicProxy(jdkRealSubject);
        ClassLoader classLoader = jdkRealSubject.getClass().getClassLoader();
        JDKSubject jdkSubject = (JDKSubject) Proxy.newProxyInstance(classLoader, new Class[]{JDKSubject.class}, proxy);
        jdkSubject.request();
    }
}