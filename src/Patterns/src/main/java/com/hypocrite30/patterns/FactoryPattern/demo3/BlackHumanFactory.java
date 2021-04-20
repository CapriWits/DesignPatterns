package com.hypocrite30.patterns.FactoryPattern.demo3;

/**
 * @Description: 「多工厂模式」黑人创建工厂实现
 * @Author: Hypocrite30
 * @Date: 2021/4/20 17:55
 */
public class BlackHumanFactory extends AbstractHumanFactory{
    public Human createHuman() {
        return (Human) new BlackHuman();
    }
}
