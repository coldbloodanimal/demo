package com.example.weixin;

import com.example.weixin.service.impl.OrderServiceImpl;
import com.github.binarywang.wxpay.config.WxPayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeixinController {
    @Autowired
    OrderServiceImpl service;

    @RequestMapping(value="",method= RequestMethod.GET)
    public String selectByPrimaryKey(){
        return "hello world!";
    }

    @RequestMapping(value="/message",method= RequestMethod.POST)
    public String message(@RequestBody String message) {
        System.out.println(message);
        return "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";
    }


    @RequestMapping(value="unifiedOrder",method= RequestMethod.GET)
    public void unifiedOrder() throws Exception {
        service.creatOrder();
    }
}
