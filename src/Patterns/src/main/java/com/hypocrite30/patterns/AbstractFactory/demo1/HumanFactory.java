package com.hypocrite30.patterns.AbstractFactory.demo1;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:26
 */
public interface HumanFactory {
    // 制造一个黄色人种
    Human createYellowHuman();
    // 制造一个白色人种
    Human createWhiteHuman();
    // 制造一个黑色人种
    Human createBlackHuman();
}
