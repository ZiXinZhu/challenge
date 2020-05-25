package com.zzx.insert.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "girl")
public class Girl {


    @Id
    @Column(length = 9)
    private int id;
    @Column
//  @Column(name = "age",columnDefinition = "int(9) DEFAULT NULL comment 'age' ")
    private int age;
    @Column
//  @Column(name = "high",columnDefinition = "int(9) DEFAULT NULL comment 'high' ")
    private int high;


    public int getId() {
        return id;
    }

    public Girl setId(int id) {
        this.id = id;
        return this;
    }


    public int getAge() {
        return age;
    }

    public Girl setAge(int age) {
        this.age = age;
        return this;
    }


    public int getHigh() {
        return high;
    }

    public Girl setHigh(int high) {
        this.high = high;
        return this;
    }

}
