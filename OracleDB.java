package com.jtl.chapter10.interface_;

public class OracleDB implements DB{
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");

    }
}
