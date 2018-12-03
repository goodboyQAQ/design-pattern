package com.wang.designpattern.observer;

import java.util.ArrayList;
import java.util.List;


public class ConcreteSubject implements Subject{

    List<Observer>  observers=new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if(observer ==null){
            throw new NullPointerException("添加的observer为null");
        }
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void removeAll() {
        observers.clear();
    }

    @Override
    public void notifyAllObserver(String msg) {
        for(Observer observer:observers){
            observer.update(this,msg);
        }
    }

    @Override
    public void notify(Observer observer, String msg) {
        if(observer!=null) {
            observer.update(this, msg);
        }
    }

    @Override
    public void callback(String msg) {
        System.out.println(msg);
    }
}
