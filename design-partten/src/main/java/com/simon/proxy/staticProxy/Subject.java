package com.simon.proxy.staticProxy;

//抽象角色
public abstract class Subject {
    public abstract void request();
}

//真实角色
class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("真实角色的请求。。。");
    }
}

//代理角色
class ProxySubject extends Subject {
    private RealSubject realSubject = null;

    @Override
    public void request() {
        preRequest();
        if (realSubject == null) {
            realSubject = new RealSubject();
            realSubject.request();
        }
        postRequest();
    }

    private void postRequest() {
        System.out.println("代理对象操作真实对象后的操作。。。");
    }

    private void preRequest() {
        System.out.println("代理对象操作真实对象前的操作。。。");
    }
}
