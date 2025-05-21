package com.juice.javalib.generics;

/**
 * @author juice
 * @date 2025年5月21日 18:23:28
 * @desc 泛型接口的实现方法 1、未传入泛型实参
 */
public class ImplGenericInterface<T> implements NormalGenericInterface<T>{

    @Override
    public T next() {
        return null;
    }
}
