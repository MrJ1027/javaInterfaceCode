package com.jtl.chapter10.interface_;

public class Interface05 {
    public static void main(String[] args) {
        System.out.println(IB.age);//说明static
        //IB.age = 30;//error，无法再次赋值，说明是final
    }
}

interface IB {
    int age = 10;//等价于 public static final int age = 10;
    void fb();
}

interface IC {
    void fc();
}
//接口不能继承其他类，但是可以继承多个别的接口
interface ID extends IC,IB{

}

//一个类可以同时实现多个接口
class DD implements IB, IC {

    @Override
    public void fb() {

    }

    @Override
    public void fc() {

    }
}

