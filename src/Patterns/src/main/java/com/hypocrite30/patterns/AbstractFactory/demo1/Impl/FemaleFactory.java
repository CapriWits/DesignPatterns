package com.hypocrite30.patterns.AbstractFactory.demo1.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo1.Human;
import com.hypocrite30.patterns.AbstractFactory.demo1.HumanFactory;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:34
 */
public class FemaleFactory implements HumanFactory {
    //生产出黑人女性
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
    //生产出白人女性
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
    //生产出黄人女性
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
