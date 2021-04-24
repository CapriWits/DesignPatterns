package com.hypocrite30.patterns.AbstractFactory.demo2.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo2.AbstractProductB;

/**
 * @Description: 「抽象工厂模式」通用案例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:50
 */
public class ProductB2 extends AbstractProductB {
    public void doSomething() {
        System.out.println("产品B2的实现方法");
    }
}
