package com.example.weixin.config;

import com.github.binarywang.wxpay.config.WxPayConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: Monster
 * @date: 2019-11-01 17:09
 **/
@Component
@Data
public class JavaWxPayConfig extends WxPayConfig {
    /**
     * 公众号appid.
     */
    //@Value("${wx.appId}")
    private String appId="asdf";
    /**
     * 服务商模式下的子商户公众账号ID.
     */
    private String subAppId;
    /**
     * 商户号.
     */
    //@Value("${wx.mchId}")
    private String mchId;
}
