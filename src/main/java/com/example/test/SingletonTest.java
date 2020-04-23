package com.example.test;

/**
 * description: SingletonTest
 * date: 2020/3/28 17:03
 * author: hantao
 * version: 1.0
 */
public class SingletonTest {

    private static volatile SingletonTest singletonTest=null;

    private SingletonTest(){}

    private static SingletonTest getInstatnce(){
        if(null==singletonTest){
            synchronized (SingletonTest.class){
                if(null==singletonTest){
                    singletonTest=new SingletonTest();
                }
            }
        }
        return singletonTest;
    }


}
