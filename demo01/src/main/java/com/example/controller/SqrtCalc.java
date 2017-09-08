package com.example.controller;

/**
 * Created by wuxiaodong on 2017/9/7.
 */
public class SqrtCalc {
    public  String sqrt(String i){
        Float iv=Float.valueOf(i);
        System.out.println(new SqrtCalc().sqrt("3.4"));
        return  String.valueOf(iv.floatValue()*iv.floatValue());
    }
}
