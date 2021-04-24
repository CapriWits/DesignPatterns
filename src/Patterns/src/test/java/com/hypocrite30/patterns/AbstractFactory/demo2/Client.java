package com.hypocrite30.patterns.AbstractFactory.demo2;


import com.hypocrite30.patterns.AbstractFactory.demo2.Impl.Creator1;
import com.hypocrite30.patterns.AbstractFactory.demo2.Impl.Creator2;
import org.junit.jupiter.api.Test;

/**
 * @Description: 「抽象工厂模式」通用案例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:58
 */
class Client {
    @Test
    public void test() {
        // 定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        // 产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        // 产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        // 产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        // 产生B2对象
        AbstractProductB b2 = creator2.createProductB();
        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();
    }
}