package com.zzx.insert.clone;

public class Money implements Cloneable {
    private int count;
    private String type;
    private String code;

    @Override
    public String toString() {
        return "Money{" +
                "count=" + count +
                ", type='" + type + '\'' +
                ", code='" + code + '\'' +
                '}';
    }


    @Override
    protected Money clone() {
        try {
            return (Money) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public Money setCount(int count) {
        this.count = count;
        return this;
    }

    public String getType() {
        return type;
    }

    public Money setType(String type) {
        this.type = type;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Money setCode(String code) {
        this.code = code;
        return this;
    }
}
