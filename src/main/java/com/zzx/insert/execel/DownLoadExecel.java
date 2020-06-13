package com.zzx.insert.execel;

import com.zzx.insert.po.GirlPO;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DownLoadExecel {
    public void down(List<GirlPO> list, HttpServletResponse response) throws IOException {
//        String filePath="F:\\simple.xls";//文件路径
//        //TODO 删除之前的表
//        File file=new File(filePath);
//        if (file.exists()){
//            file.delete();
//        }
        HSSFWorkbook workbook = new HSSFWorkbook();//创建Excel文件(Workbook)
        HSSFSheet sheet = workbook.createSheet("sheet1");//创建工作表(Sheet)
        HSSFRow row = sheet.createRow(0);// 创建行,从0开始
        HSSFCell cell = row.createCell(0);// 创建行的单元格,也是从0开始
        cell.setCellValue("店名");// 设置单元格内容
        row.createCell(1).setCellValue("金额");// 设置单元格内容,重载
        row.createCell(2).setCellValue("goodsId");
        row.createCell(3).setCellValue("user");// 设置单元格内容,重载

        for (int i = 0; i < list.size(); i++) {
            HSSFRow rows = sheet.createRow(i + 1);// 创建行,从1开始
            HSSFCell cells = rows.createCell(0);// 创建行的单元格,也是从0开始
            cells.setCellValue(list.get(i).getId());// 设置单元格内容
            rows.createCell(1).setCellValue(list.get(i).getAge());// 设置单元格内容,重载
            rows.createCell(2).setCellValue(list.get(i).getHigh());
            rows.createCell(3).setCellValue(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date().getTime()));// 设置单元格内容,重载

        }
        String filename = "taobao.xls";
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "utf-8"));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);//保存Excel文件
        outputStream.close();//关闭文件流
        System.out.println("OK!");
    }


}
