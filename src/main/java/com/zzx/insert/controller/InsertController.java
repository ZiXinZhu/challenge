package com.zzx.insert.controller;


import com.zzx.insert.annotate.Permission;
import com.zzx.insert.dao.InsertDao;
import com.zzx.insert.po.GirlPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class InsertController {

    @Autowired
    InsertDao dao;


    @GetMapping("/add")
    public int add() {
//        Long start=System.currentTimeMillis()/1000;
//        for(int i=0;i<1000;i++){
//            dao.add();
//        }
//        Long end=System.currentTimeMillis()/1000;
//
//        int l=(int)(end-start);
//        System.out.println(l);

        return dao.add();
    }
    @Permission(isPass = false)
    @GetMapping("/all")
    public List<GirlPO> girl(){
        return dao.all();
    }

    @GetMapping("/one")
    public GirlPO one(){
       return dao.one(1);
    }

}
