package com.zzx.insert.design.mondle_clone;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Cloneable {
    private List<String> list=new ArrayList<>();

    @Override
    public Parent clone() {
        Parent parent=null;
        try {
            parent=(Parent) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return parent;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
