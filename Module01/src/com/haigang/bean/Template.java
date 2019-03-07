package com.haigang.bean;

import java.util.ArrayList;

/**
 * @author lcx
 * @create 2019-03-07 14:19
 */
public class Template {
    public static void main(String[] args) {
        // xxx.sout
        int num1 = 10;
        System.out.println(num1);   // num1.sout

        System.out.println();

        // fori for循环
        String[] arr = new String[]{"tom", "jack", "li"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        // 变形： itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        // list.for: list集合的遍历
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {     // list.for
            System.out.println(o);
        }

        // 变形：list.fori   list.forr
        for (int i = 0; i < list.size(); i++) {
            // list.fori
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            // list.forr 逆向判断
        }

        // ifn
        if (list == null) {

        }
        // inn
        if (list != null) {
            
        }
        // 变形：xxx.nn  xxx.null
        if (list != null) {
            // list.nn
        }
        if (list == null) {
            // list.null
        }


    }
}
