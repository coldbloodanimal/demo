package com.example.weixin.service.impl;

import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Monster
 * @date: 2019-11-01 14:30
 **/
@Service
@Slf4j
public class OrderServiceImpl {


    @Resource
    private WxPayService payService;

    String openId="oEV5S0fp7h566wL-O4-Ep_jvNlt4";
    public void creatOrder() throws WxPayException {
        WxPayUnifiedOrderRequest request = WxPayUnifiedOrderRequest.newBuilder()
                .body("我去")
                .totalFee(1)
                .spbillCreateIp("11.1.11.1")
                .notifyUrl("111111")
                .tradeType(WxPayConstants.TradeType.NATIVE)
                .openid(openId)
                .outTradeNo("007")
                .build();
        request.setSignType(WxPayConstants.SignType.HMAC_SHA256);
        WxPayUnifiedOrderResult result = this.payService.unifiedOrder(request);
        log.info(result.toString());
        log.warn(this.payService.getWxApiData().toString());
    }

}
