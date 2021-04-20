package com.hypocrite30.patterns.FactoryPattern.demo3;

/**
 * @Description: 「多工厂模式」工厂抽象
 * @Author: Hypocrite30
 * @Date: 2021/4/20 17:51
 */
public abstract class AbstractHumanFactory {
    /**
     * 不再需要传递相关参数
     * 因为每一个具体的工厂都已经非常明确自己的职责：创建自己负责的产品类对象
     * @return
     */
    public abstract Human createHuman();
}
