package com.wang.designpattern.event;

public class GoodNotifier extends Notifier{
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("添加"+methodName+"事件了");
        EventHandler handler = this.getEventHandler();
        handler.addEvent(object, methodName, args);

    }

    @Override
    public void notifyX() {
        System.out.println("执行事件了");
        try{
            this.getEventHandler().notifyX();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
