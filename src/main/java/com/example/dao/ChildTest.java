package com.example.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * description: ChildTest
 * date: 2020/2/21 19:25
 * author: hantao
 * version: 1.0
 */
@Data
public class ChildTest implements Serializable {

    private String id;

    private List<ChildTest> child;

    public static void main(String[] args) {
        String str="{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": 1548,\n" +
                "      \"weight\": 1,\n" +
                "      \"category_name\": \"奶粉\",\n" +
                "      \"category_code\": \"01\",\n" +
                "      \"category_status\": null,\n" +
                "      \"parent_code\": \"0\",\n" +
                "      \"category_level\": 1,\n" +
                "      \"picture_path\": \"http://aq-flows-test.oss-cn-beijing.aliyuncs.com/dev/category-picture/02f6a7ce-9375-4dcf-b107-2898c230ea55.jpg?Expires=1886638491&OSSAccessKeyId=LTAILR1FRNY70UY0&Signature=iksvYG%2FMbZ2PvrN0hKYqSxx6cfg%3D\",\n" +
                "      \"picture_name\": \"0.jpg\",\n" +
                "      \"product_category_resp\": [\n" +
                "        {\n" +
                "          \"id\": 1549,\n" +
                "          \"weight\": 1,\n" +
                "          \"category_name\": \"牛奶粉\",\n" +
                "          \"category_code\": \"0101\",\n" +
                "          \"category_status\": null,\n" +
                "          \"parent_code\": \"01\",\n" +
                "          \"category_level\": 2,\n" +
                "          \"picture_path\": null,\n" +
                "          \"picture_name\": null,\n" +
                "          \"product_category_resp\": [\n" +
                "            {\n" +
                "              \"id\": 1550,\n" +
                "              \"weight\": 1,\n" +
                "              \"category_name\": \"牛奶粉一段\",\n" +
                "              \"category_code\": \"010101\",\n" +
                "              \"category_status\": null,\n" +
                "              \"parent_code\": \"0101\",\n" +
                "              \"category_level\": 3,\n" +
                "              \"picture_path\": null,\n" +
                "              \"picture_name\": null,\n" +
                "              \"product_category_resp\": [\n" +
                "                {\n" +
                "                  \"id\": 1551,\n" +
                "                  \"weight\": 1,\n" +
                "                  \"category_name\": \"牛奶粉一段听装/桶装/罐装\",\n" +
                "                  \"category_code\": \"01010101\",\n" +
                "                  \"category_status\": null,\n" +
                "                  \"parent_code\": \"010101\",\n" +
                "                  \"category_level\": 4,\n" +
                "                  \"picture_path\": null,\n" +
                "                  \"picture_name\": null,\n" +
                "                  \"product_category_resp\": []\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JSONObject json= JSON.parseObject(str);
        JSONArray data = json.getJSONArray(json.get("data").toString());
        JSONArray data1 = JSONArray.parseArray(json.get("data").toString());
        System.out.println(data1);
        List<ProductCategoryRespVO> data2 = JSONArray.parseArray(json.get("data").toString(),ProductCategoryRespVO.class);
        System.out.println(data2);
    }

}
