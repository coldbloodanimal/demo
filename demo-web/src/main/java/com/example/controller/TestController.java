//package com.example.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import javax.servlet.ServletRequest;
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//import java.nio.charset.Charset;
//
//@RestController
//public class TestController {
//
////    @Autowired
////    RestTemplate restTemplate;
//
//    @RequestMapping(value="/test",method= RequestMethod.GET)
//    public void test(){
//
////        String result=restTemplate.postForEntity("http://221.226.214.210:8116/hcinterface/v1/hospitalInterface/connection/test",null,String.class).getBody();
////        System.out.println(result);
//    }
//
//
//    @RequestMapping(value="/addDetail2",method= RequestMethod.GET)
//    public void addDetail2(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//
//        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
//        map.add("params", "{\"accessToken\":\"02c3148c-dd54-49f3-9eb6-ab7524b0140b\",\"orderId\":\"200617171320218696630354\",\"hospitalId\":\"JSJY10000000000000330123\",\"list\":[{\"hospitalOrderDetailId\":\"111\",\"goodsID\":\"1234525\",\"companyIdPs\":\"3308\",\"purchaseCount\":\"11\",\"orderDetailRemark\":\"订单明细备注\", \"orderCustomInfo\":\"自定义订单填写信息传用于医疗机构与配送企业之间的数据传输\"},{\"hospitalOrderDetailId\":\"222\",\"goodsID\":\"1234576\",\"companyIdPs\":\"209\",\"purchaseCount\":\"2222\",\"orderDetailRemark\":\"订单明细备注\", \"orderCustomInfo\":\"自定义订单填写信息传用于医疗机构与配送企业之间的数据传输\"}]}");
//
//        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
//        String url="http://221.226.214.210:8116/hcinterface/v1/hospitalInterface/orderdetail/add";
////        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
//        System.out.println(response.getBody().toString());
//    }
//
//
//    @RequestMapping(value="/addDetail",method= RequestMethod.GET)
//    public void addDetail(){
//        String url="http://221.226.214.210:8116/hcinterface/v1/hospitalInterface/orderdetail/add?params={\"accessToken\":\"02c3148c-dd54-49f3-9eb6-ab7524b0140b\",\"orderId\":\"200617171320218696630354\",\"hospitalId\":\"JSJY10000000000000330123\",\"list\":[{\"hospitalOrderDetailId\":\"111\",\"goodsID\":\"1234525\",\"companyIdPs\":\"3308\",\"purchaseCount\":\"11\",\"orderDetailRemark\":\"订单明细备注\", \"orderCustomInfo\":\"自定义订单填写信息传用于医疗机构与配送企业之间的数据传输\"},{\"hospitalOrderDetailId\":\"222\",\"goodsID\":\"1234576\",\"companyIdPs\":\"209\",\"purchaseCount\":\"2222\",\"orderDetailRemark\":\"订单明细备注\", \"orderCustomInfo\":\"自定义订单填写信息传用于医疗机构与配送企业之间的数据传输\"}]}";
////        String result=restTemplate.postForEntity(url,null,String.class).getBody();
//        System.out.println(result);
//    }
//
//    @RequestMapping(value="/request",method= RequestMethod.GET)
//    public void request(String url){
//        String result=restTemplate.postForEntity(url,null,String.class).getBody();
//        System.out.println(result);
//    }
//
//    @RequestMapping(value="/encodeRequestUrl",method= RequestMethod.GET)
//    public void encodeRequestUrl(String url) throws UnsupportedEncodingException {
//        String result=restTemplate.postForEntity(URLEncoder.encode(url, "utf-8"),null,String.class).getBody();
//        System.out.println(result);
//    }
//}
