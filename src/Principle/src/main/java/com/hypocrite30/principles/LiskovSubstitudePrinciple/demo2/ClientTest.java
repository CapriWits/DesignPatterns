package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo2;

import java.util.HashMap;

/**
 * @Description: 测试「覆盖或实现父类的方法时输入参数可以被放大」
 * @Author: Hypocrite30
 * @Date: 2021/4/16 22:50
 */
public class ClientTest {
    public static void invoker1() {
        //父类存在的地方，子类就应该能够存在
        Father f = new Father();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void invoker2() {
        //父类存在的地方，子类就应该能够存在
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invoker1();
        invoker2();
    }
}


