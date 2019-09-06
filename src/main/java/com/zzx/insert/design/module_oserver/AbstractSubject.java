package com.zzx.insert.design.module_oserver;


import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AbstractSubject {

    CopyOnWriteArrayList<AbstractObserver> list = new CopyOnWriteArrayList<>();

    String state = null;

    public void addObserver(AbstractObserver abstractObserver) {
        list.add(abstractObserver);
    }

    public void delObserver(AbstractObserver abstractObserver) {
        list.remove(abstractObserver);
    }

    public void notifyOberver(String state) {
        for (AbstractObserver s : list
        ) {
            s.update(state);
        }
    }
}
