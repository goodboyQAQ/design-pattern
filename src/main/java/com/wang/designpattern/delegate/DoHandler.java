package com.wang.designpattern.delegate;

public class DoHandler implements Handler{
    private Handler handler;

    public DoHandler(Handler Handler){
        this.handler=Handler;
    }

    @Override
    public void say() {
        System.out.println("说话");
        this.handler.say();
    }

    @Override
    public void eat() {
        System.out.println("吃");
        this.handler.eat();
    }

}
