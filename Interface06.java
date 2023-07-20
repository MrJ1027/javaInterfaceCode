package com.jtl.chapter10.interface_;

public class Interface06 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(A06.a);//a为static
        System.out.println(b.a);//a为public
        System.out.println(B.a);//B实现了A06，所以可以用a
    }
}

interface A06{
    int a = 10;//public static final int a = 10;
}

class B implements A06{

}