package com.example.demoeasyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :zw
 * 时间：2023/3/9
 */
public class OrderService {

    public List<OrderDto> getOrderList(){
        List<OrderDto> list =new ArrayList<>();
        OrderDto o1=new OrderDto();
        o1.setOrderNo("1");
        o1.setTotalPrice(BigDecimal.TEN);
        o1.setProductName("小笼包");

        OrderDto o2=new OrderDto();
        o2.setOrderNo("1");
        o2.setTotalPrice(BigDecimal.TEN);
        o2.setProductName("八宝粥");

        OrderDto o3=new OrderDto();
        o3.setOrderNo("1");
        o3.setTotalPrice(BigDecimal.TEN);
        o3.setProductName("榨菜");

        OrderDto o4=new OrderDto();
        o4.setOrderNo("2");
        o4.setTotalPrice(BigDecimal.ONE);
        o4.setProductName("足力健老人鞋");
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        return list;
    }
}
