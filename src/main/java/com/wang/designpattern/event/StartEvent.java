package com.wang.designpattern.event;

import javafx.scene.effect.Effect;

import java.util.logging.Handler;

/**
 *  事件委托模式
 *  完全解耦  通知者可以通知执行不同的方法  得益于（Event EventHandler)
 */
public class StartEvent {
    public static void main(String[] args){
        DoSomeThing do1=new DoSomeThing();
        //只需要Event EventHandler就行了
        EventHandler eventHandler=new EventHandler();
        eventHandler.addEvent(do1,"say","张三","sb");
        eventHandler.addEvent(do1,"fight","李四","张三");
        try {
            eventHandler.notifyX();
        }catch (Exception e){

        }
        //加一个观察者 模仿观察者模式
        Notifier goodNotifier=new GoodNotifier();
        goodNotifier.addListener(do1,"say","张三","sb");
        goodNotifier.addListener(do1,"fight","李四","张三");
        goodNotifier.notifyX();

    }
}
