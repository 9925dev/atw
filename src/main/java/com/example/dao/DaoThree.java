package com.example.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * description: java8 对list集合中的对象遍历,重新赋值两种方法，遍历某个属性返回数组
 * date: 2020/1/10 16:46
 * author:
 * version: 1.0
 */
@Slf4j
public class DaoThree {

    private boolean flag;

    public static void main(String[] args) {
        List<FiveDao> list=new ArrayList<>();
        list.add(new FiveDao(10,"zhangming"));
        list.add(new FiveDao(12,"zhangsan"));
        list.add(new FiveDao(13,"lishi"));
        list.add(new FiveDao(11,"wangwu"));
        list.add(new FiveDao(14,"zhaoliu"));
        log.info("list:"+list);
        //方法一:
        list.forEach(p -> p.setName(UUID.randomUUID().toString().replaceAll("-", "")));
        log.info("list2:"+list);
        //方法二:会报错 有时候会报错，请使用方法一和二
//        list = list.stream().map(p -> p.setName(UUID.randomUUID().toString().replaceAll("-", "")) ).collect(Collectors.toList());
        //方法三:
        list=list.stream().map(detailVo -> {
            FiveDao detail = new FiveDao();
            BeanUtils.copyProperties(detailVo, detail);
            detail.setName(UUID.randomUUID().toString().replaceAll("-", ""));
            return detail;
        }).collect(Collectors.toList());
        log.info("list3:"+list);

        //遍历某个属性
        List<String> skuCodes=list.stream().map(FiveDao::getName).collect(Collectors.toList());
        log.info("skuCodes:"+skuCodes);
    }

}
