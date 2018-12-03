package com.wang.designpattern.delegate;

/**
 * 代理模式/委托模式
 * 间接调用 代理者持有一个 代理者可做些额外操作
 */
public class StartDelegate {
    public static void main(String[] args){
        Handler handler=new DoHandler(new SecondHandler());
        handler.eat();
    }
}
