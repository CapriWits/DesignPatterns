package com.hypocrite30.patterns.AbstractFactory.demo1.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo1.Human;
import com.hypocrite30.patterns.AbstractFactory.demo1.HumanFactory;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:36
 */
public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    //生产出白人男性
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
    //生产出黄人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
