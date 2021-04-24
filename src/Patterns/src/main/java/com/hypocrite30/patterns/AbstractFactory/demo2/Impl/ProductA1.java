package com.hypocrite30.patterns.AbstractFactory.demo2.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo2.AbstractProductA;

/**
 * @Description: 「抽象工厂模式」通用案例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:50
 */
public class ProductA1 extends AbstractProductA {
    public void doSomething() {
        System.out.println("产品A1的实现方法");
    }
}
