package com.simon.proxy.dynamicProxy;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

class CGLibDynamicProxyTest {

    /**
     * 通过CGLIB的Enhancer来指定要代理的目标对象、实际处理代理逻辑的对象，最终通过调用create()方
     * 法得到代理对象，对这个对象所有非final方法的调用都会转发给MethodInterceptor.intercept()方法，
     * 在intercept()方法里我们可以加入任何逻辑，比如修改方法参数，加入日志功能、安全检查功能等；通
     * 过调用MethodProxy.invokeSuper()方法，我们将调用转发给原始对象，具体到本例，就是
     * HelloConcrete的具体方法。
     * 对于从Object中继承的方法，CGLIB代理也会进行代理，如hashCode()、equals()、toString()等，但是
     * getClass()、wait()等方法不会，因为它是final方法，CGLIB无法代理。
     */
    @Test
    public void test01(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new CGLibDynamicProxy());

        HelloConcrete hello = (HelloConcrete) enhancer.create();
        System.out.println(hello.sayHello("I love you!"));
    }
}