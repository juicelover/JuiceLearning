package com.juice.javalib.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author juice
 * @date 2025年5月21日 18:19:10
 * @desc 泛型数组
 */
public class NonGeneric2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("mark");
        list.add("juice");
        //list.add(100);//Error: Required type:String Provided:int
        //插入错误的数据类型，在插入的时候就能发现

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);//不需要强制类型转换
            System.out.println("name: " + name);
        }
    }
}
