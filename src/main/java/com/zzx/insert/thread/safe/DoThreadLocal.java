package com.zzx.insert.thread.safe;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class DoThreadLocal implements Runnable {
    private static ThreadLocal<String> local = new ThreadLocal<>();
    //TODO 代替同步Map
    private static ThreadLocal<ConcurrentHashMap<String, String>> localMap = new ThreadLocal<>();
    //TODO 代替同步List
    private static ThreadLocal<CopyOnWriteArrayList< String>> localList = new ThreadLocal<>();
    //TODO 代替同步Set
    private static ThreadLocal<CopyOnWriteArraySet< String>> localSet = new ThreadLocal<>();

    @Override
    public void run() {
        synchronized (this) {
            local.set("zzx");
            try {
                Thread.sleep(2000);
                System.out.println("ONE:" + local.get());
                local.set("qq");
                System.out.println("TWO:" + local.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //TODO 判断字符串非空（org.springframework.util.StringUtils）
        String string = "z";
        boolean empty = StringUtils.isEmpty(string);
        System.out.println(String.valueOf(empty));
        //TODO 判断集合是否为空（需要导入依赖commons-collections4）
        Collection<String> collection = new ArrayList<>();
        boolean b = CollectionUtils.isEmpty(collection);
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(System.nanoTime()));
        System.out.println(String.valueOf(System.currentTimeMillis()));
        new Thread(new DoThreadLocal()).start();
    }
}