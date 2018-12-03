package com.wang.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 动态代理后，可以在方法执行前插入操作
 *
 */
public class StartProxy {
    public static void main(String[] args){
        Subject realSubject=new RealSubject();
        System.out.println(realSubject);
        InvocationHandler handler=new ProxyHandler(realSubject);
        Subject subject=(Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
                .getClass().getInterfaces(), handler);
        System.out.println(subject.getClass().getName());
        subject.hello("sdfs");
    }
}
