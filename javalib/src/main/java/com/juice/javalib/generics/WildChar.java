package com.juice.javalib.generics;

public class WildChar {
    public static void print(GenericType<Fruit> f) {
        System.out.println(f.getData().getColor());
    }

    public static void use() {

        GenericType<Fruit> a = new GenericType<>();
        print(a);
        GenericType<Orange> b = new GenericType<>();
//        print(b);//泛型没有任何关系
    }

    /**
     * extends 上界通配符，接受Fruit或其子类
     */
    public static void print2(GenericType<? extends Fruit> f) {
        System.out.println(f.getData().getColor());
    }

    public static void use2() {

        GenericType<Fruit> a = new GenericType<>();
        print2(a);
        GenericType<Orange> b = new GenericType<>();
        print2(b);
//        print2(new GenericType<Food>());
        GenericType<? extends Fruit> c = b;

        Apple apple = new Apple();
        Fruit fruit = new Fruit();
//        c.setData(apple); //不知道传入的是Fruit的哪一个子类
//        c.setData(fruit); //不知道传入的是Fruit的哪一个子类
        Fruit x = c.getData();

    }

    /**
     * super 下界通配符，接受Apple或其父类
     */
    public static void printSuper(GenericType<? super Apple> f) {
        System.out.println(f.getData());
    }

    public static void useSupper() {

        GenericType<Fruit> fruitGenericType = new GenericType<>();
        GenericType<Apple> appleGenericType = new GenericType<>();
        GenericType<Orange> orangeGenericType = new GenericType<>();
        GenericType<HongFuShi> hongFuShiGenericType = new GenericType<>();

        printSuper(fruitGenericType);
        printSuper(appleGenericType);
//        printSuper(orangeGenericType);   //是 Apple 的子类
//        printSuper(hongFuShiGenericType);//是 Fruit 的子类，但不是 Apple 的父类

        GenericType<? super Apple> x = new GenericType<>();
        x.setData(new Apple());
//        x.setData(new Fruit());
        x.setData(new HongFuShi());
        Object data = x.getData();
    }
}
