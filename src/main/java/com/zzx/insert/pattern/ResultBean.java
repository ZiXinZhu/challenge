package com.zzx.insert.pattern;

public class ResultBean <T>{
    private int id=1;
    private String name="zzx";
    private String phone="123456";
    private T result;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
