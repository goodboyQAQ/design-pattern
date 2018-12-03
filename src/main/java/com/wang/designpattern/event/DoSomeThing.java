package com.wang.designpattern.event;

public class DoSomeThing {
    public void say(String name,String msg){
        System.out.println(name+"说："+msg);
    }

    public void fight(String name,String name2){
        System.out.println(name+"打了"+name2);
    }
}
