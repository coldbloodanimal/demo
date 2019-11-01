package com.example.weixin.service.impl;

import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.impl.BaseWxPayServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author: Monster
 * @date: 2019-11-01 14:23
 **/
@Service
public class DemoWxPayService extends BaseWxPayServiceImpl {
    @Override
    public byte[] postForBytes(String s, String s1, boolean b) throws WxPayException {
        return new byte[0];
    }

    @Override
    public String post(String s, String s1, boolean b) throws WxPayException {
        return null;
    }
}
