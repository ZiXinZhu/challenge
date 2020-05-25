package com.zzx.insert.elecel;

import com.zzx.insert.po.GirlPO;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static javax.xml.bind.JAXBIntrospector.getValue;

@Service
public class UpLoadExecel {

    public List<GirlPO> readXls(byte[] bytes) throws IOException {

//        InputStream is =new ByteArrayInputStream(bytes);
        InputStream is = new FileInputStream(new File("E:\\taobao.xls"));
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        GirlPO girlPO = null;
        List<GirlPO> list = new ArrayList<GirlPO>();
        // 循环工作表Sheet
        for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // 循环行Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow == null) {
                    continue;
                }
                girlPO = new GirlPO();
                // 循环列Cell
                HSSFCell id = hssfRow.getCell(0);
                if (id == null) {
                    continue;
                }
                girlPO.setId((int) Double.parseDouble(String.valueOf(getValue(id))));

                HSSFCell age = hssfRow.getCell(1);
                if (age == null) {
                    continue;
                }
                girlPO.setAge((int) Double.parseDouble(String.valueOf(getValue(age))));

                HSSFCell high = hssfRow.getCell(2);
                if (high == null) {
                    continue;
                }
                girlPO.setHigh((int) Double.parseDouble(String.valueOf(getValue(high))));

                HSSFCell time = hssfRow.getCell(3);
                if (time == null) {
                    continue;
                }

                System.out.printf(String.valueOf(getValue(time)));
                list.add(girlPO);
            }
        }
        return list;
    }

}
