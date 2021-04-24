package com.hypocrite30.patterns.AbstractFactory.demo2;

/**
 * @Description: 「抽象工厂模式」通用案例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:48
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod() {
    }
    // 每个产品相同方法，不同实现
    public abstract void doSomething();
}
