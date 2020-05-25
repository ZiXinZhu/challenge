package com.zzx.insert.tree;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Data
@Service
public class Tree<T> {
    private T t;
    private T parent;
    private T right;
    private T left;

    @PostConstruct
    public void say() {
        System.out.println("==================================================================================================");
    }

    public static void main(String[] args) {
        String json = "{\"token\":\"token\",\"userName\":\"姓名\",\"fileListArr\": [{\"fileName\":\"11\",\"fileType\":\"png\",\"fileUrl\":\"https://hsoss.runnar.com/runnar/img/marketingtagImg/SRX25tjY6E.png\"},{\"fileName\":\"22\",\"fileType\":\"jpg\",\"fileUrl\":\"https://hsoss.runnar.com/runnar/img/marketingtagImg/SRX25tjY6E.png\"},{\"fileName\":\"33\",\"fileType\":\"pdf\",\"fileUrl\":\"https://hsoss.runnar.com/runnar/img/marketingtagImg/SRX25tjY6E.png\"}],\"matchEventId\":\"3\",\"userInfoId\":\"112\"}";
//        String json="{\"token\":\"token\",\"userName\":\"姓名\",\"fileListArr\": null,\"matchEventId\":\"3\",\"userInfoId\":\"112\"}";

        JSONObject jsonObject = JSON.parseObject(json);
        String userName = jsonObject.getString("userName");
        long matchEventId = jsonObject.getLong("matchEventId");
        long userInfoId = jsonObject.getLong("userInfoId");
        String fileListArr = jsonObject.getString("fileListArr");
        JSONArray jsons = JSON.parseArray(fileListArr);

        System.out.println(jsons.get(0));
        Object s = jsons.get(0);
    }
}
