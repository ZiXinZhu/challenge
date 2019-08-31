package com.zzx.insert.design.mondle_clone;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Cloneable {
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public Parent clone() {
        Parent parent=null;
        try {
            parent=(Parent) super.clone();
            parent.list= (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return parent;
    }

    public List<String> getList() {
        return list;
    }
}
