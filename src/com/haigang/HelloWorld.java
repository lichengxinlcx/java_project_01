package com.haigang;

import com.haigang.bean.Hello;
import com.haigang.bean.Test;

public class HelloWorld {
    // 模板 prsf
    private static final Hello hello = new Hello();

    // 变形：psf
    public static final Test test = new Test();
    // 变形： psfi
    public static final int NUM1 = 10;
    // 变形：psfs
    public static final String STR = "all";

    public void testUpdate(){
        System.out.println("update");
    }
    
    /**
     * 私有变量 id
     */
    private int id;
     
    /**
     * 私有变量 str
     */
     private String str;
     



    private String name;
    private Integer age;

    public HelloWorld() {
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public HelloWorld(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
