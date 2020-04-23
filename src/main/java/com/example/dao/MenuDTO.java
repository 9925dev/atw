package com.example.dao;

import lombok.Data;

import java.util.List;

/**
 * description: Menu
 * date: 2020/2/26 16:59
 * author: hantao
 * version: 1.0
 */
@Data
public class MenuDTO {

    private Integer id;
    private Integer pid;
    private List<MenuDTO> children;
}
