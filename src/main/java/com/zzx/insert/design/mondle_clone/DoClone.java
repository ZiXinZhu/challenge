package com.zzx.insert.design.mondle_clone;

public class DoClone {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.getList().add("zzx");
        parent.clone().getList().add("qq");
        for (String l : parent.getList()
                ) {
            System.out.println(l);
        }
    }

}
