package com.zzx.insert.enums;

public class TestEnum {
    public static void main(String[] args) {
        String flage="CHINA";
        String phone="123456789";
        People people=new People();
        people.setCountry(Enum.valueOf(UserEnum.class,flage));
        people.setPhone(phone);
        System.out.println(people);
    }
}
