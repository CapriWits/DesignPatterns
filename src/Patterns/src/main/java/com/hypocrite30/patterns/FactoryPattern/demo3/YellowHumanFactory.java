package com.hypocrite30.patterns.FactoryPattern.demo3;

/**
 * @Description: 「多工厂模式」黄人创建工厂实现
 * @Author: Hypocrite30
 * @Date: 2021/4/20 17:56
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return (Human) new YellowHuman();
    }
}
