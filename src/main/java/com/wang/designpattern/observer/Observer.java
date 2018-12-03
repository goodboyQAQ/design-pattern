package com.wang.designpattern.observer;

/**
 * 观察者
 * 观察者需要提供一个方法让通知者调用 实现通知
 * 方法一般会要求通知者将自己作为参数传递过来，方便回调使通知者进行后续处理
 */
public interface Observer {
    /**
     *
     * @param subject  被观察者
     * @param msg 被观察者传递过来的数据
     */
    void update(Subject subject,String msg);
}
