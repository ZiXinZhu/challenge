package com.zzx.insert.design.module_proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GameProxy implements InvocationHandler {

/*

   //被代理者
    Class cls =null;
    //被代理的实例
    Object obj = null;
    //我要代理谁
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }
    //调用被代理的方法
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }*/


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
