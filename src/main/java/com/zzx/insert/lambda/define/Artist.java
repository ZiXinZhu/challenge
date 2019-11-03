package com.zzx.insert.lambda.define;



public class Artist {
    private String name;
    private int age;
    private String from;

    public Artist() {
    }

    public Artist(String name, int age, String from) {
        this.name = name;
        this.age = age;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
