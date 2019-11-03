package com.zzx.insert.lambda;


public class StaticClassDemo {

    public static void main(String[] args) {
        StreamUseEntity.Album album = new StreamUseEntity.Album();
        StreamUseEntity streamUseEntity = new StreamUseEntity();
        StreamUseEntity.Test test = streamUseEntity.new Test();
    }
}
