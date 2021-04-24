package com.hypocrite30.patterns.AbstractFactory.demo2;

/**
 * @Description: 「抽象工厂模式」通用案例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:52
 */
public abstract class AbstractCreator {
    // 创建A产品家族
    public abstract AbstractProductA createProductA();
    // 创建B产品家族
    public abstract AbstractProductB createProductB();
}
