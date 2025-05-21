package com.juice.javalib.generics;

/**
 * @author juice
 * @date 2025年5月21日 19:37:13
 * @desc 泛型类中的泛型方法
 */
public class GenericMethod3 {
    static class Fruit{
        @Override
        public String toString() {
            return "fruit";
        }
    }

    static class Apple extends Fruit{

        @Override
        public String toString() {
            return "apple";
        }
    }

    static class Person{
        @Override
        public String toString() {
            return "person";
        }
    }

    static class GenericTest<T>{

        public void show_1(T t){
            System.out.println(t.toString());
        }

        /**
         * 在泛型类种声明一个泛型方法，使用泛型 T
         * 这个 T 是一种全新的类型，可以与泛型类中声明的 T 不是同一类型
         */
        public <T> void show_2(T t){
            System.out.println(t.toString());
        }

        /**
         * 泛型类中声明了一个泛型方法，使用泛型 E,这种泛型 E 可以使任意类型
         * 可以与 T 相同，也可以与 T 不同
         * 由于泛型方法在声明的时候会声明泛型<E>,因此即使在泛型类中未声明泛型，
         * 编译器也能正确识别泛型方法中的泛型
         */
        public <E> void show_3(E e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {

        Apple apple = new Apple();
        Fruit fruit = new Fruit();
        Person person = new Person();

        GenericTest<Fruit> genericTest = new GenericTest<>();
        genericTest.show_1(apple);
//        genericTest.show_1(person);

        //泛型类中定义的泛型方法以泛型方法中的泛型为主
        genericTest.show_2(apple);
        genericTest.show_2(person);

        genericTest.show_3(apple);
        genericTest.show_3(person);
    }
}
