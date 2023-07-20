package com.jtl.chapter10.interface_;

public class InterfacePoly {
    public static void main(String[] args) {
        //接口多态体现：接口类型的变量a01 可以指向 实现了AAA接口类的对象实例
        AAA a01 = new Person();
        a01 = new People();
    }
}

interface AAA{}
class Person implements AAA{

}
class People implements AAA{

}
