package com.zzx.insert.design.module_memorandum.white_back;

public class DoMemory {

    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();

        originator.setState("on");

        caretaker.saveMemory(originator.createMemory());
        originator.setState("off");

        originator.reMemory(caretaker.reMemory());
        System.out.println(originator.getState());
    }

}
