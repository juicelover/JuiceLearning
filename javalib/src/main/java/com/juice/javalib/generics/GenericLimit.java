package com.juice.javalib.generics;

import java.io.Serializable;

/**
 * @author juice
 * @date 2025年5月21日 20:02:34
 * @desc 类型变量的限定
 */
public class GenericLimit {

    /**
     * 对类型变量加以约束
     * T 表示应该绑定类型的子类型，Comparable 表示绑定类型，子类型和绑定类型可以使类也可以是接口
     * extends 左右都允许有多个，如 T,V   Comparable&Serializable
     * 限定类型中，只允许有一个类，如果有类，这个类必须是限定列表的第一个。
     * 限定即可以放在泛型方法上也可以放在泛型类上
     */
    public static <T extends Comparable & Serializable> T min(T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    static class Test{}

    public static void main(String[] args) {

        System.out.println(GenericLimit.min("mark","juice"));
        System.out.println(GenericLimit.min(12,5));
        //reason: no instance(s) of type variable(s) exist so that Test conforms to Comparable
        //试图传入一个没有实现接口Comparable的类的实例，将会发生编译错误
//        System.out.println(GenericLimit.min(new Test(),new Test()));
    }
}
