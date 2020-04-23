package com.example.test;

/**
 * description: Sing
 * date: 2020/4/14 15:09
 * author: hantao
 * version: 1.0
 */
public class Sing {

    private static volatile Sing ss=null;

    private Sing(){}

    private Sing getSs(){
        if(null==ss){
            synchronized (Sing.class){
                if(null==ss){
                    ss=new Sing();
                }
            }
        }
        return ss;
    }

}
