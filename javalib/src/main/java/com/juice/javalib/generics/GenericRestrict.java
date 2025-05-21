package com.juice.javalib.generics;

/**
 * @author juice
 * @date 2025年5月21日 20:20:26
 * @desc 泛型中的约束和局限性
 */
public class GenericRestrict<T> {

    private T data;

    //Type parameter 'T' cannot be instantiated directly
    //不能实例化类型变量
//    public GenericRestrict() {
//        this.data = new T();
//    }

    //'com.juice.javalib.generics.GenericRestrict.this' cannot be referenced from a static context
    //泛型类的静态上下文中类型变量失效即静态域或方法中不能引用类型变量
//    private static T instance;
    //静态方法是泛型方法就可以
    private static <T> T getInstance() {
        return null;
    }

    public static void main(String[] args) {

        //不能使用基本类型，泛型类型参数必须是引用类型
//        GenericRestrict<double>//Type argument cannot be of primitive type
        GenericRestrict<Double> genericRestrict = new GenericRestrict<>();

        //Illegal generic type for instanceof 泛型不能使用 instanceof
//        if (genericRestrict instanceof GenericRestrict<Double>)

        GenericRestrict<String> restrict = new GenericRestrict<>();
        //Condition 'restrict.getClass() == genericRestrict.getClass()' is always 'true'
        //获得的为泛型类的原生类型
        System.out.println(restrict.getClass() == genericRestrict.getClass());

        GenericRestrict<Double>[] genericRestricts;
        //Generic array creation not allowed
        //可以定义泛型数组，但不能创建泛型数组
//        GenericRestrict<Double>[] restricts = new GenericRestrict<Double>[10];
    }

    //Generic class may not extend 'java.lang.Throwable'
//    private class Problem<T> extends Exception{}

    /**
     * Variable 't' is already defined in the scope
     * 不能捕获泛型类的实例
     */
//    public <T extends Throwable> void doWork(T t){
//        try {
//
//        }catch (T t){
//
//        }
//    }


    //可以把t抛出去
    public <T extends Throwable> void doWorkSuccess(T t) throws T{
        try {

        }catch (Throwable throwable){
            throw t;
        }
    }
}
