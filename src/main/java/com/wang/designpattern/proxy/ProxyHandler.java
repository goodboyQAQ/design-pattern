package com.wang.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object subject;

    public ProxyHandler(Object o){
        this.subject=o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我可以对所有不同的代理对象都执行这句话");
        return method.invoke(subject,args);
    }
}
