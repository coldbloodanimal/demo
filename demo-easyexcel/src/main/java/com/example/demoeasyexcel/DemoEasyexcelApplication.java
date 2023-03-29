package com.example.demoeasyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.List;

@SpringBootApplication
public class DemoEasyexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEasyexcelApplication.class, args);


        OrderService orderService=new OrderService();
        Calendar calendar=Calendar.getInstance();
        String fileName = "D:\\"+calendar.get(Calendar.HOUR)+"-"+calendar.get(Calendar.MINUTE)+"-"+calendar.get(Calendar.SECOND) +".xlsx";
        ExcelWriter excelWriter = EasyExcel.write(fileName).excelType(ExcelTypeEnum.XLSX).build();

        List<OrderDto> demoDataList = orderService.getOrderList();
        WriteSheet writeSheet = EasyExcel.writerSheet("模板1").head(OrderDto.class)
                .registerWriteHandler(new GroupByIdMergeStrategy<>(demoDataList,"orderNo", 1,0,1))
                .build();
        excelWriter.write(demoDataList, writeSheet);
        excelWriter.finish();
    }
}
