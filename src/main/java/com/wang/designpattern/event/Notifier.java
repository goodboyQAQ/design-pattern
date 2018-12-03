package com.wang.designpattern.event;

import lombok.Data;

/**
 * 通知者维护一个自己的事件处理器
 */
@Data
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    public abstract void addListener(Object object, String methodName,
                                     Object... args);


    public abstract void notifyX();

}
