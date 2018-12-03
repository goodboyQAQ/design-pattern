package com.wang.designpattern.observer;

/**
 * 观察者模式 发布订阅模式
 * 优点：很好地解耦了通知者与观察者，观察者不需要了解通知者内部是怎样实现的，
 *       方便于日后代码的修改，体现了依赖倒转的原则。
 * 缺点：抽象通知者还是依赖了抽象观察者，当没有观察者的时候，没办法更新
 *       所有观察者属于相同的类，且执行相同的方法
 */
public class Start {
    public static void main(String[] args){
        Observer observer=new ConcereObserver();
        Observer observer1=new ConcereObserver();
        Subject subject=new ConcreteSubject();
        subject.addObserver(observer);
        subject.addObserver(observer1);
        subject.notifyAllObserver("老师来了");

    }
}
