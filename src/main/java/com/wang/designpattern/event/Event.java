package com.wang.designpattern.event;

import lombok.Data;

import java.lang.reflect.Method;


/**
 * 事件模型
 * 提供给事件处理器 执行invoke()方法
 * 含有成员变量：执行该事件的对象，对象将要执行的方法名，需要的参数对象数组，需要的参数类型数组
 */
@Data
public class Event {
    //要执行方法的对象
    private Object object;
    //要执行的方法名称
    private String methodName;
    //要执行方法的参数
    private Object[] params;
    //要执行方法的参数类型
    private Class[] paramTypes;


    public Event(Object object,String methodName,Object...args){
        this.object=object;
        this.methodName=methodName;
        this.params=args;
        contractParamTypes(this.params);
    }
    //根据参数数组生成参数类型数组
    private void contractParamTypes(Object[] params){
        this.paramTypes=new Class[params.length];
        for(int i=0;i<params.length;i++){
            this.paramTypes[i]=params[i].getClass();
        }
    }


    /**
     * 根据该对象的方法名，方法参数，利用反射机制，执行该方法
     * @throws Exception
     */
    public void invoke() throws Exception{
        Method method=object.getClass().getMethod(methodName,paramTypes);
        if(method!=null){
            method.invoke(this.getObject(), params);
        }
    }

}
