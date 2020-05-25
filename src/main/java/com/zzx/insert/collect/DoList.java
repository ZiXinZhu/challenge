package com.zzx.insert.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DoList {
    public static void main(String[] args) {
//        Lock lock=new ReentrantLock();
        List<String> list = new LinkedList<>();
        list.add("zzx");
        list.add("other");
        list.add("others");
        List<String> listsub = list.subList(1, 3);
        System.out.println(listsub);
        String[] result = new String[0];
        result = list.toArray(result);
        System.out.println(result);
        List<String> lists = new ArrayList<>(list);
        System.out.println(lists);
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        System.out.println(copyOnWriteArrayList);
    }
}
