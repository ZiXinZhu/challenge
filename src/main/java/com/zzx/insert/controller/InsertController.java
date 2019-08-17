package com.zzx.insert.controller;


import com.zzx.insert.annotate.Permission;
import com.zzx.insert.dao.InsertDao;
import com.zzx.insert.elecel.DownLoadExecel;
import com.zzx.insert.elecel.UpLoadExecel;
import com.zzx.insert.po.GirlPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class InsertController {

    @Autowired
    InsertDao dao;
    @Autowired
    DownLoadExecel downLoadExecel;
    @Autowired
    UpLoadExecel upLoadExecel;


    @GetMapping("/add")
    public int add() {
        return dao.add();
    }

    @Permission(isPass = true)
    @GetMapping("/all")
    public void girl( HttpServletResponse response) throws IOException {
        downLoadExecel.down(dao.all(),response);
    }

    @Permission(isPass = false)
    @GetMapping("/one")
    public GirlPO one(){
       return dao.one(1);
    }


    @Permission(isPass = true)
    @GetMapping("/upload")
    public List<GirlPO> upload(byte[] bytes) throws IOException {
        return  upLoadExecel.readXls(bytes);
    }

}
