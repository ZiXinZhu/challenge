package com.zzx.insert.curl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCurl {


    public static void main(String[] args) {
        //必须分开写，不能有空格
        String[] cmds = {"curl", "-u", "zhuhailong:admin", "-XGET", "http://192.168.11.187:8080/users/login",
                "-H", "X-Requested-By:sdc"};
        System.out.println(execCurl(cmds));
    }


    public static String execCurl(String[] cmds) {
        ProcessBuilder process = new ProcessBuilder(cmds);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            return builder.toString();

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
        return null;
    }
}
