package com.zzx.insert.design.module_memorandum.white_back;

public class Caretaker {
    private Memory memory;

    public Memory reMemory(){
        return this.memory;
    }

    public void saveMemory(Memory memory){
        this.memory=memory;
    }
}
