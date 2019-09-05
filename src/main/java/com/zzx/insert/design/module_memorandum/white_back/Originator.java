package com.zzx.insert.design.module_memorandum.white_back;


public class Originator {

    private String state;

    public Memory createMemory(){
        return new Memory(state);
    }

    public void reMemory(Memory memory){
        this.state=memory.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
