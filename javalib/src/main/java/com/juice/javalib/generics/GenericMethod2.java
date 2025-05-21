package com.juice.javalib.generics;

/**
 * @author juice
 * @date 2025年5月21日 19:10:49
 * @desc 普通类中的泛型方法
 */
public class GenericMethod2 {

    //泛型类
    public static class Generic<T>{
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        //虽然在这个方法中使用了泛型，但是这并不是一个泛型方法
        //这只是一个成员方法，只不过返回值是在声明泛型类已经声明过的类型
        //所以才在这个方法中继续使用 T 这个泛型
        public T getKey() {
            return key;
        }

        /**
         * error： Cannot resolve symbol 'E'
         * 因为在类的声明中并未声明泛型 E,所以在使用 E 做形参和返回值类型时，编译器会无法识别。
         */
//        public E setKey(E key) {
//            this.key = key;
//        }
    }

    /**
     * 泛型方法
     * public 与返回值之间的<T>必不可少，这表明是一个泛型方法，并声明了一个泛型T
     * 这个T可以出现在这个泛型方法的任意位置
     * 泛型的数量也可以为任意多个
     */
    public <T,K> K showKeyName(Generic<T> container){

        return null;
    }

    /**
     * 普通方法，只是使用了Generic<Number>这个泛型类做形参
     */
//    public void show(Generic<Number> generic){
//
//    }

    /**
     * error:Cannot resolve symbol 'E'
     *只声明了泛型类型T，并未声明泛型类型E，因此编译器无法处理E这个类型
     */
//    public <T> T show(Generic<E> ab){//error:Cannot resolve symbol 'E'
    public <T,E> T show(Generic<E> ab){
        return null;
    }

    /**
     * error:Cannot resolve symbol 'T'
     * 泛型T是内部类的，当前类并未声明泛型T，所以编译错误
     */
//    public void show(T obj){
//
//    }
}
