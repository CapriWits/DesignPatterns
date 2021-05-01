package com.hypocrite30.patterns.AdapterPattern.demo2;

/**
 * @Description: 「适配器模式」通用源码
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:05
 */
public class Adaptee {
    //原有的业务逻辑
    public void doSomething() {
        System.out.println("I'm kind of busy, leave me alone.");
    }
}
