package com.hypocrite30.patterns.FactoryPattern.demo4;

/**
 * @Description: 「工厂模式替代单例模式」单例对象
 * @Author: Hypocrite30
 * @Date: 2021/4/20 22:10
 */
public class Singleton {
    //不允许通过new产生一个对象
    private Singleton() {
    }
    public void doSomething() {
        // 业务处理
    }
}
