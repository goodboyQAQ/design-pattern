package com.wang.designpattern.proxy;

public class RealSubject implements Subject{
    @Override
    public void hello(String msg) {
        System.out.println(msg);
    }
}
