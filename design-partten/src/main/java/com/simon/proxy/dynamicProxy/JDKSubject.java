package com.simon.proxy.dynamicProxy;

//委托类抽象
public interface JDKSubject {
    public abstract void request();
}

//委托类具体
class JDKRealSubject implements JDKSubject {
    @Override
    public void request() {
        System.out.println("真实角色的请求。。。");
    }
}