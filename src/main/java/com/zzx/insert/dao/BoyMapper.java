package com.zzx.insert.dao;

import com.zzx.insert.po.Boy;

import java.util.List;

public interface BoyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Boy record);

    int insertSelective(Boy record);

    List<Boy> selectByAge(Integer age);

    Boy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boy record);

    int updateByPrimaryKey(Boy record);
}