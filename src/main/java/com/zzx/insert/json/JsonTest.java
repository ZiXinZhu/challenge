package com.zzx.insert.json;

import com.alibaba.fastjson.JSON;
import com.zzx.insert.entity.UserVO;

import java.util.List;

public class JsonTest {
    public static void main(String[] args) {
        String data="[{\"username\":\"zzx\",\"password\":\"123\",\"age\":\"25\"},{\"username\":\"qq\"}]";
        List<UserVO> list= JSON.parseArray(data,UserVO.class);
        System.out.println(list);

    }
}
