package com.jtl.chapter10.interface_;

public class MysqlDB implements DB{
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql");

    }
}
