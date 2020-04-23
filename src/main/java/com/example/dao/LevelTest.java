//package com.example.dao;
//
//import com.aiqin.ground.util.http.HttpClient;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.fasterxml.jackson.core.type.TypeReference;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.StringUtils;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * description: LevelTest
// * date: 2020/2/21 19:15
// * author: hantao
// * version: 1.0
// */
//@Slf4j
//public class LevelTest {
//
//    public void test1(List<String> ids){
//        Map<String,String> map1=new HashMap<>();
//        Map<String,String> map2=new HashMap<>();
//        Map<String,String> map3=new HashMap<>();
//        Map<String,String> map4=new HashMap<>();
//        Map<String,String> map5=new HashMap<>();
//        Map<String,String> map6=new HashMap<>();
//        List<ChildTest> l3=new ArrayList<>();
//        //01020304
//        for(String id:ids){
//            String str1=id.substring(0,2);
//            String str2=id.substring(0,4);
//            String str3=id.substring(0,6);
//            map1.put(str2,str1);//(二级，一级)
//            map2.put(str3,str2);//(三级，二级)
//            map3.put(id,str3);//(四级，三级)
//            map4.put(str1,"一级");
//            map5.put(str2,"二级");
//            map6.put(str3,"三级");
//        }
//        List<ChildTest> l1=new ArrayList<>();
//        List<ChildTest> l2=new ArrayList<>();
//
//        for(Map.Entry<String,String> map:map3.entrySet()){
//            ChildTest c=new ChildTest();
//            c.setId(map.getKey());
//            c.setChild(getChild());
//            l1.add(c);
//        }
//
//
//    }
//
//    public void getChild(Map<String,String> map){
//        for(Map.Entry<String,String> m:map.entrySet()){
//
//        }
//    }
//
//    public ChildTest getChild(String id){
//        ChildTest ct=new ChildTest();
//        ct.setId(id);
//        return ct;
//    }
//
//    public void getCCC(){
//
//        String url="http://product.api.aiqin.com/search/spu/sku/category";
//        log.info("根据退货单号查询支付状态入参，url={}",url);
//        JSONObject json=new JSONObject();
//        json.put("level",1);
//        json.put("parentCode","0");
//        HttpClient httpClient = HttpClient.post(url).json(json);
//        Map<String ,Object> result=null;
//        result = httpClient.action().result(new TypeReference<Map<String ,Object>>() {});
//        log.info("根据退货单号查询支付状态结果，request={}",result);
//        if (StringUtils.isNotBlank(String.valueOf(result.get("code"))) && "0".equals(String.valueOf(result.get("code")))) {
//            List<Company> jsonMap = JSONArray.parseArray(JSON.toJSONString(result.get("data")), Company.class);
//            List<Company> returnList = new ArrayList<>();
//
//
//        }
//
//    }
//
//}
