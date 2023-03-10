package com.example.demoeasyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author :zhaowei
 * 时间：2023/3/7
 */
@Data
public class OrderDto {

    @ColumnWidth(20)
    @ExcelProperty(value = "订单号",index = 0)
    private String orderNo;

    @ColumnWidth(20)
    @ExcelProperty(value = "总金额",index = 1)
    private BigDecimal totalPrice;


    /**
     * 订单明细信息
     */
    @ColumnWidth(20)
    @ExcelProperty(value = "产品名称",index = 2)
    private String productName;


}
