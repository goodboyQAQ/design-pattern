package com.wang.designpattern.observer;

public class ConcereObserver implements Observer{
    @Override
    public void update(Subject subject, String msg) {
        System.out.println("传来消息:"+msg);
        subject.callback("消息收到");
    }
}
