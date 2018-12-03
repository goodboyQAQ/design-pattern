package com.wang.designpattern.delegate;

public class FirstHandler implements Handler{

    @Override
    public void say() {
        System.out.println("我是老大");
    }

    @Override
    public void eat() {
        System.out.println("我吃一碗饭");
    }
}
