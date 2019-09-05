package com.zzx.insert.design.module_assemble;

import java.util.List;

public class Bush extends Dress {

    private List<Dress> list;

    private String name ;

    public Bush(String name) {
        this.name = name;
    }

    @Override
    public void printName() {

    }

    @Override
    public void addChild() {
        super.addChild();
    }

    @Override
    public void removeChild() {
        super.removeChild();
    }

    @Override
    public List<Dress> getChild() {
        return super.getChild();
    }
}
