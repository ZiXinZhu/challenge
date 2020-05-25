package com.zzx.insert.clone;

public class Clone {
    public static void main(String[] args) {
        //第一次测试
//        Person person1=new Person();
//        person1.setId(1);
//        person1.setName("zzx");
//        Person husky1=person1;
//        System.out.println(person1.toString());
//        System.out.println(husky1.toString());
//        person1.setId(2);
//        System.out.println(person1.toString());
//        System.out.println(husky1.toString());
//        husky1.setName("lq");
//        System.out.println(person1.toString());
//        System.out.println(husky1.toString());


        //第二次测试 person实现cloneable
//        Person person2 = new Person();
//        person2.setId(1);
//        person2.setName("zzx");
//        Person husky2 = person2.clone();
//        System.out.println(person2.toString());
//        System.out.println(husky2.toString());
//        person2.setId(2);
//        System.out.println(person2.toString());
//        System.out.println(husky2.toString());
//        husky2.setName("lq");
//        System.out.println(person2.toString());
//        System.out.println(husky2.toString());

        //第三次测试 person实现cloneable，新增Money
//        Person person3 = new Person();
//        person3.setId(1);
//        person3.setName("zzx");
//        Money money3=new Money();
//        money3.setCode("256");
//        money3.setCount(200);
//        money3.setType("RMB");
//        person3.setMoney(money3);
//        Person husky3 = person3.clone();
//        System.out.println(person3.toString());
//        System.out.println(husky3.toString());
//        person3.setId(2);
//        person3.setMoney(money3.setType("US"));
//        System.out.println(person3.toString());
//        System.out.println(husky3.toString());
//        husky3.setName("lq");
//        husky3.setMoney(money3.setCode("862"));
//        System.out.println(person3.toString());
//        System.out.println(husky3.toString());

        //第四次测试 person实现cloneable，新增Money,新增Money实现cloneable
        Person person4 = new Person();
        person4.setId(1);
        person4.setName("zzx");
        Money money4 = new Money();
        money4.setCode("256");
        money4.setCount(200);
        money4.setType("RMB");
        person4.setMoney(money4);
        Person husky4 = person4.clone();
        System.out.println(person4.toString());
        System.out.println(husky4.toString());
        person4.setId(2);
        person4.setMoney(money4.setType("US"));
        System.out.println(person4.toString());
        System.out.println(husky4.toString());
        husky4.setName("lq");
        husky4.setMoney(husky4.getMoney().setCode("862"));
        System.out.println(person4.toString());
        System.out.println(husky4.toString());

    }
}
