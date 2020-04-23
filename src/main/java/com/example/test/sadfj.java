package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * description: sadfj
 * date: 2020/4/13 16:08
 * author: hantao
 * version: 1.0
 */
public class sadfj {
    public static void main(String args[]) {
        String candidateString = "This is a Java example.This is another Java example.";
        Pattern p = Pattern.compile("a");
        Matcher matcher = p.matcher(candidateString);
        matcher.find();
        int nextIndex = matcher.end();
        System.out.print("The last index of Java is:");
        System.out.println(nextIndex);
    }
}
