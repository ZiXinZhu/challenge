package com.zzx.insert.dao;

import com.zzx.insert.po.Boy;

import java.util.List;

public interface BoyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Boy record);

    int insertSelective(Boy record);

    Boy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boy record);

    int updateByPrimaryKey(Boy record);


    List<Boy> selectByAge(Integer age);

    List<Boy> selectByHigh(Integer high);
}