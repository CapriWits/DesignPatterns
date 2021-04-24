package com.hypocrite30.patterns.AbstractFactory.demo2.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo2.AbstractCreator;
import com.hypocrite30.patterns.AbstractFactory.demo2.AbstractProductA;
import com.hypocrite30.patterns.AbstractFactory.demo2.AbstractProductB;

/**
 * @Description: 「抽象工厂模式」通用案例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:53
 */
public class Creator2 extends AbstractCreator {
    //只生产产品等级为1的A产品
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生产产品等级为1的B产品
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
