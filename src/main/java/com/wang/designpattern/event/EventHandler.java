package com.wang.designpattern.event;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理器
 * 负责添加事件模型 通知处理事件
 */
public class EventHandler {

    private List<Event> events=new ArrayList<Event>();;


    //添加一个事件模型
    public void addEvent(Object object,String methodName,Object...args){
        events.add(new Event(object,methodName,args));
    }
    //通知所有的对象执行指定的事件
    public void notifyX() throws Exception{
        for(Event e : events){
            e.invoke();
        }
    }

}
