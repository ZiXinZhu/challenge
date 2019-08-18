package com.zzx.insert.design.module_single;

public class DoSingle {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            SingleMoudle moudle=SingleMoudle.getinstance();
            moudle.say();
        }
    }
}
