package com.zzx.insert.design.module_assemble;

public class Leaf extends Dress {

    private String name;


    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printName() {

        System.out.println(name);
    }
}
