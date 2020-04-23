package com.example.test;

/**
 * description: SingleTown
 * date: 2020/4/18 20:43
 * author: hantao
 * version: 1.0
 */
public class Singleton {

    private static volatile Singleton singleton=null;

    private Singleton(){}

    private Singleton getSingleton(){
        if(null==singleton){
            synchronized(Singleton.class){
                if(null==singleton){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

}
