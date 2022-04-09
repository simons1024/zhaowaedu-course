package com.simon.proxy.staticProxy;
import org.junit.jupiter.api.Test;

public class SubjectTest {

    @Test
    public void test01(){
        Subject subject = new ProxySubject();
        subject.request();
    }
}