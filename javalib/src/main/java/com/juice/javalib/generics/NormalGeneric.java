package com.juice.javalib.generics;

/**
 * @author juice
 * @date 2025年5月21日 18:09:14
 * @desc 泛型类
 */
public class NormalGeneric<T> {

    private T data;

    public NormalGeneric() {
    }

    public NormalGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

        NormalGeneric<String> normalGeneric = new NormalGeneric<>();
        normalGeneric.setData("JUICE");
        System.out.println(normalGeneric.getData());
    }
}
