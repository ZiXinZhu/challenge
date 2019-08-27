package com.zzx.insert.design.module_proxy.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class GameProxy implements InvocationHandler {
    private Object object;

    public GameProxy() {
    }

    public GameProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("before");
        Object o= method.invoke(object,args);
        log.info("after");
        return o;
    }

}
