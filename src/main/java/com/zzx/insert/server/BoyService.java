package com.zzx.insert.server;

import com.zzx.insert.dao.BoyMapper;
import com.zzx.insert.po.Boy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoyService {


    @Autowired(required = false)
    BoyMapper boyMapper;


    public Boy selectByPrimaryKey(int id){
        return boyMapper.selectByPrimaryKey(id);
    }
}
