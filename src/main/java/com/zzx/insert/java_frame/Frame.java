package com.zzx.insert.java_frame;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;

public class Frame {


    public static void main(String[] args) {
        JFrame jFrame=new JFrame("拳皇");
        jFrame.setSize(500,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panel=new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("数据"));
        JPanel down=new JPanel();
        down.setBorder(BorderFactory.createTitledBorder("参数"));
        down.setSize(500,250);


        jFrame.setContentPane(panel);

    }


}
