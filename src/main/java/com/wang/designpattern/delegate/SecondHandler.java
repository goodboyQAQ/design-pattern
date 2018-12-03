package com.wang.designpattern.delegate;

public class SecondHandler implements Handler{
    @Override
    public void say() {
        System.out.println("俺是老二");
    }

    @Override
    public void eat() {
        System.out.println("俺吃两碗饭");
    }
}
