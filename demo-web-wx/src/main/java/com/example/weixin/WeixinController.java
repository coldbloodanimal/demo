package com.example.weixin;

import com.example.weixin.config.WxPayConfigImpl;
import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeixinController {


    @Autowired
    WXPayConfig wxPayConfig;
    @RequestMapping(value="",method= RequestMethod.GET)
    public String selectByPrimaryKey(){
        return "hello world!";
    }

    @RequestMapping(value="test",method= RequestMethod.GET)
    public String test() throws Exception {

    }


    @RequestMapping(value="unifiedOrder",method= RequestMethod.POST)
    public String unifiedOrder() throws Exception {
        WXPayConfig config = new WxPayConfigImpl();
        WXPay wxpay = new WXPay(config);

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

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello world!";
    }
}
