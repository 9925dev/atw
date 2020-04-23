package com.example.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * description: Excutor
 * date: 2020/4/16 10:34
 * author: hantao
 * version: 1.0
 */
public class Excutor {

    public static void main(String[] args) {
        ExecutorService es=new ThreadPoolExecutor(2,5,3, TimeUnit.SECONDS,new ArrayBlockingQueue(10));
        es.execute(new zhixing());
        es.execute(new zhixing());
        es.shutdown();
    }
}

class zhixing implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("hhhha:"+i);
        }

    }
}