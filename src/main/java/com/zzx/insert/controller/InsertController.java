package com.zzx.insert.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzx.insert.annotate.Permission;
import com.zzx.insert.dao.InsertDao;
import com.zzx.insert.elecel.DownLoadExecel;
import com.zzx.insert.elecel.UpLoadExecel;
import com.zzx.insert.po.GirlPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetAddress;
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



    @GetMapping("/zzz")
    public void request(HttpServletRequest request,String s) throws Throwable{
        System.out.println("getRequestURI:"+request.getRequestURI());
        System.out.println("getMethod:"+request.getMethod());
        System.out.println("getServletPath:"+request.getServletPath());
        System.out.println("getHeader:"+request.getHeader(s));
        System.out.println("getContextPath:"+request.getContextPath());
        System.out.println("getRemoteUser:"+request.getRemoteUser());
        System.out.println("getParameter:"+request.getParameter("s"));
        System.out.println("getSession:"+request.getSession().getId());
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local HostAddress:"+addr.getHostAddress());
        String hostname = addr.getHostName();
        System.out.println("Local host name: "+hostname);
        String remoteAddr = request.getRemoteAddr();
        System.out.println("remoteAddr "+remoteAddr);
    }

    @GetMapping("/add")
    public int add() {
        return dao.add();
    }

    /**
     *   【PageHelper】分页插件
     * @param response
     * @throws IOException
     */
    @Permission(isPass = true)
    @GetMapping("/all")
    public void girl( HttpServletResponse response) throws IOException {
        PageInfo<GirlPO> page = PageHelper.startPage(1, 2).doSelectPageInfo(() -> dao.all());
        System.out.println(page);
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
