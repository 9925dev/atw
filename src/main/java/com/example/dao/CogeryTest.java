package com.example.dao;

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
public class CogeryTest implements Serializable {

    private String categoryCode;

    private String categoryName;

    private String pid;

    private Integer level;

}
