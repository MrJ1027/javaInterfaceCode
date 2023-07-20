package com.jtl.chapter10.interface_;

public class Interface04 {
    public static void main(String[] args) {
        //new IA(); 接口不能被实例化
    }
}

interface IA {
    //接口中所以方法都是public方法，接口中抽象方法可以不用abstract修饰
    void say();

    void hi();
}

class AA implements IA {//alt + enter;
    //一个普通类实现接口，就必须将该接口的所有方法都实现
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class BB implements  IA{
    //抽象类实现接口时，可以不实现接口的方法
}
