package com.wang.designpattern.observer;



/**
 * 通知者
 *  1.通知者不需要考虑观察者是怎么实现的，只需要调用观察者提供的方法 完成通知即可
 *  2.通知者可额外提供一个方法供回调使用
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void removeAll();
    void notifyAllObserver(String msg); //通知所有观察者
    void notify(Observer observer,String msg); //通知一个观察者
    void callback(String msg);
}
