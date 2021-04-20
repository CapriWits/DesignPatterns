package com.hypocrite30.patterns.FactoryPattern.demo1;

/**
 * @Description: 「工厂模式」人类工厂抽象
 * @Author: Hypocrite30
 * @Date: 2021/4/19 22:50
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
