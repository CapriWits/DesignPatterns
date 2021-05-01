package com.hypocrite30.patterns.AdapterPattern.demo2;

/**
 * @Description: 「适配器模式」通用源码
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:03
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("If you need any help, call me!");
    }
}
