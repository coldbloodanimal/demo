package com.example.weixin;

import com.github.binarywang.wxpay.config.WxPayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeixinController {
    @Autowired
    WxPayConfig wxPayConfig;

    @RequestMapping(value="",method= RequestMethod.GET)
    public String selectByPrimaryKey(){
        return "hello world!";
    }

    @RequestMapping(value="test",method= RequestMethod.GET)
    public String test() throws Exception {
    return wxPayConfig.getAppId();
    }


    @RequestMapping(value="unifiedOrder",method= RequestMethod.POST)
    public String unifiedOrder() throws Exception {

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "腾讯充值中心-QQ会员充值");
        data.put("out_trade_no", "2016090910595900000012");
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");
        data.put("notify_url", "http://www.example.com/wxpay/notify");
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
        data.put("product_id", "12");
        return "hello world!";
    }
}
