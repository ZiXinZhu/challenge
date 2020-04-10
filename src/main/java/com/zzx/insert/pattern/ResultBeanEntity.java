package com.zzx.insert.pattern;


public class ResultBeanEntity<T> extends ResultBean<T> {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
