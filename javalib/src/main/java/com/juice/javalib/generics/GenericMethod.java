package com.juice.javalib.generics;

/**
 * @author juice
 * @date 2025年5月21日 18:55:56
 * @desc 普通类里泛型方法
 */
public class GenericMethod {

    @SafeVarargs
    public final <T> T genericMethod(T... a) {
        return a[a.length / 2];
    }

    public void test(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.test(1, 2);
        System.out.println(genericMethod.genericMethod("mark", "juice", "moto"));
        System.out.println(genericMethod.genericMethod(11, 5, 48));
    }
}
