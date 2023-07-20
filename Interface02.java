package com.jtl.chapter10.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

//如果一个类implements实现接口，需要将该接口所有抽象方法都实现
class A implements AInterface{
    @Override
    public void f1() {

    }
}

interface AInterface{
    //可以定义属性
    public int n1 = 10;
    //可以定义方法(抽象方法、默认实现方法、静态方法)
    //在接口中，抽象方法可以省略abstract关键字
    //jdk8后,可以有默认实现方法，需要使用default关键字修饰
    default public void f1(){
        System.out.println("f1调用....");
    }

    public static void f2(){
        System.out.println("f2调用....");
    }
}