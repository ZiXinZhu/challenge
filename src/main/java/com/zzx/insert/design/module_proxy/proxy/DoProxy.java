package com.zzx.insert.design.module_proxy.proxy;

import com.zzx.insert.design.module_proxy.game.GamePlayer;
import com.zzx.insert.design.module_proxy.game.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DoProxy {

    public static void main(String[] args) {
        //TODO 被代理对象
        IGamePlayer player=new GamePlayer();

        //TODO 实现InvocationHandler接口方式
        IGamePlayer gameProxy=(IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(),player.getClass().getInterfaces(),new GameProxy(player));
        gameProxy.login("zzx","123");
        gameProxy.killBoss();
        gameProxy.upGrrad();

        //TODO 匿名内部类方式
        IGamePlayer iGamePlayer= (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始");
                        Object o=method.invoke(player,args);
                        System.out.println("结束");
                        return o;
                    }
                }
                );
        iGamePlayer.killBoss();
        iGamePlayer.upGrrad();
        iGamePlayer.login("zzx","123");
    }


}
