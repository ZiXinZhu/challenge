package com.zzx.insert.enums;

import java.util.Arrays;

public enum UserEnum {
    CHINA("Chinese", 1), AMRICA("Amrica", 2);

    private String name;
    private Integer id;

    private UserEnum test(String name) {
        UserEnum[] values = values();
        for (UserEnum e : values) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return AMRICA;
    }

    UserEnum(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
