package com.jtl.chapter10.interface_;

public class ExtendsAndInterface {
    public static void main(String[] args) {
        littleMonkey wukong = new littleMonkey("wukong");
        wukong.climb();
        wukong.swimming();
    }
}

//小猴子继承了Monkey类，只会爬树，假如小猴子也会游泳，无法再继承鱼类（因为java的单继承）
//这时用到接口，作为单继承的补充机制
//当子类继承了父类，就自动游泳父类的功能
//如果子类需要扩展功能，可以通过实现接口的方式扩展

//继承 is-a 比如香蕉是水果，金丝猴是猴子
//接口 like-a 比如香蕉可以用作武器，金丝猴也会像鱼一样游泳

interface fish{
    void swimming();
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climb(){
        System.out.println(name + "会爬树");
    }

    public String getName(){
        return name;
    }
}

class littleMonkey extends Monkey implements fish{

    public littleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "会游泳");
    }
}