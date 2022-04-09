package com.simon.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**Subject和RealSubject的创建信息是和静态代理一样的
 * 动态代理解决静态代理中代理类接口过多的问题，通过反射来实现的，借助Java自带的
 * java.lang.reflect.Proxy,通过固定的规则生成。
 *
 * 步骤如下：
 * 1. 编写一个委托类的接口，即静态代理的（Subject接口）
 * 2. 实现一个真正的委托类，即静态代理的（RealSubject类）
 * 3. 创建一个动态代理类，实现InvocationHandler接口，并重写该invoke方法
 * 4. 在测试类中，生成动态代理的对象。
 */
//代理类
public class JDKDynamicProxy implements InvocationHandler {
    private Object object;

    public JDKDynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象前置可完成的业务");
        Object result = method.invoke(object, args);
        System.out.println("代理对象后置可完成的业务");
        return result;
    }
}