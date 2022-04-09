package com.simon.proxy.dynamicProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * CGLIB是一个强大的高性能的代码生成包，底层是通过使用一个小而快的字节码处理框架ASM，它可以
 * 在运行期扩展Java类与实现Java接口，Enhancer是CGLIB的字节码增强器，可以很方便的对类进行拓展
 * 创建代理对象的几个步骤:
 * 1、生成代理类的二进制字节码文件
 * 2、加载二进制字节码，生成Class对象( 例如使用Class.forName()方法 )
 * 3、通过反射机制获得实例构造，并创建代理类对象
 */
public class CGLibDynamicProxy implements MethodInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(CGLibDynamicProxy.class);
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("You said: " + Arrays.toString(objects));
        return methodProxy.invokeSuper(o, objects);
    }
}

/**
 * 1. jdk动态代理：利用拦截器(拦截器必须实现InvocationHanlder)加上反射机制生成一个实现代理接
 * 口的匿名类，在调用具体方法前调用InvokeHandler来处理。只能对实现了接口的类生成代理只能
 * 对实现了接口的类生成代理
 * 2. cglib：利用ASM开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处
 * 理。主要是对指定的类生成一个子类，覆盖其中的方法，并覆盖其中方法实现增强，但是因为采用
 * 的是继承，对于final类或方法，是无法继承的。
 * 3. 选择
 * 4.
 * 1）. 如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP。
 * 2）. 如果目标对象实现了接口，可以强制使用CGLIB实现AOP。
 * 3）. 如果目标对象没有实现了接口，必须采用CGLIB库，Spring会自动在JDK动态代理和CGLIB之
 * 间转换。
 */