package com.hypocrite30.patterns.AbstractFactory.demo1.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo1.AbstractWhiteHuman;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:26
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    public void getSex() {
        System.out.println("白人男性");
    }
}
