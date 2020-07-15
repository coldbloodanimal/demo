package com.example.oss;

import com.aliyun.oss.OSSClient;
import com.example.config.OssConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OssController {
    @Autowired
    OSSClient ossClient;

    @Autowired
    OssService ossService;
    @RequestMapping(value = "endpoint",method= RequestMethod.GET)
    public String getOssConfig(){
        return ossClient.getEndpoint().toString();
    }

    @RequestMapping(value = "/oss/policy",method= RequestMethod.GET)
    public String getPolicy(){
        return ossService.getPolicy();
    }

}
