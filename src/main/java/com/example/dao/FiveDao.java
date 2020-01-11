package com.example.dao;

/**
 * description: FiveDao
 * date: 2020/1/10 16:50
 * author: hantao
 * version: 1.0
 */

public class FiveDao {

    private int age;

    private String name;

    public FiveDao() {
    }

    public FiveDao(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FiveDao{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
