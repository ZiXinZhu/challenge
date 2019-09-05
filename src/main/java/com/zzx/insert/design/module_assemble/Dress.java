package com.zzx.insert.design.module_assemble;

import com.zzx.insert.exception.CommonException;

import java.util.List;

public abstract class Dress {


    public abstract void printName();

    public void addChild(){
        throw new CommonException("添加失败");
    }

    public void removeChild(){
        throw new CommonException("删除失败");
    }

    public List<Dress> getChild(){
        throw new CommonException("获取失败");
    }
}
