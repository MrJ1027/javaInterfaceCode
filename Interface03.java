package com.jtl.chapter10.interface_;
//接口的简单实例
public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        test(mysqlDB);
        System.out.println("---------");
        test(oracleDB);
        //感觉接口有点像cpp的多继承
    }
    public static void test(DB DBInterface){
        DBInterface.connect();
        DBInterface.close();
    }
}
