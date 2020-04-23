package com.example.test;

import java.io.File;

/**
 * description: a
 * date: 2020/4/15 15:23
 * author: hantao
 * version: 1.0
 */
public class a {
    private String name;

    public String getName() {

        System.out.println("sdfasfd");
        return name;
    }

    public String getNam() {

        System.out.println("aaa");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        a ss=new b();
        ss.getNam();
        a sss=(a)ss;
        sss.getNam();
        b sd=new b();
        sd.getName();
    }
}
