package com.haigang.bean;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        synchronized ()

        ArrayList list1 = new ArrayList();
        list1.add(0,123);

        Date date = new Date();

        method1();


    }

    public static void method1(){
        // 单行注释
        /**
         * 多行注释
         */
    }
}
