package com.zzx.insert.dao;

import com.zzx.insert.po.GirlPO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InsertDao {

    @Insert("insert into girl (age,high) values (19,173)")
    int add();

    @Select("Select * from girl")
    List<GirlPO> all();

    @Select("Select * from girl where id=#{id}")
    GirlPO one(@Param("id") int id);

}
