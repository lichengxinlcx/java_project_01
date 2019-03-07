package com.haigang;

import java.util.HashMap;

/**
 * @author lcx
 * @create 2019-03-07 16:31
 */
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "10");
        map.put("school", "Qinghua");
        map.put("major", "computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
