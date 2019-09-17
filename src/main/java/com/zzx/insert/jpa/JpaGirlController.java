package com.zzx.insert.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/jpa")
public class JpaGirlController {

    private static final int SUCCESS_CODE=1;

    @Autowired
    JpaGirlDao jpaGirlDao;

    /**
     *  新增
     * @param age
     * @param high
     * @return
     */
    @GetMapping("/insert")
    public String add(int age,int high){
       int res= jpaGirlDao.addGirl(age,high);
       if(res==SUCCESS_CODE){
           return "success";
       }
       return "failure";
    }

    /**
     *  删除
     * @param age
     * @return
     */
    @GetMapping("/del")
    public String del (int age){
      int res= jpaGirlDao.deleteByAge(age);
        if(res==SUCCESS_CODE){
            return "success";
        }
        return "failure";
    }

    /**
     *  修改
     * @param age
     * @param high
     * @return
     */
    @GetMapping("/update")
    public String updateGirl(int age,int high){
        int res=jpaGirlDao.updateGirl(age,high);
        if(res==SUCCESS_CODE){
            return "success";
        }
        return "failure";

    }

    /**
     *  删除
     * @param age
     * @return
     */
    @GetMapping("/get")
    public List<Girl> getByAge(int age){
        List<Girl> list=jpaGirlDao.findByAge(age);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        return list;
    }
}
