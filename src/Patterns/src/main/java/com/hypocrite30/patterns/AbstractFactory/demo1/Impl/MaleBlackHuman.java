package com.hypocrite30.patterns.AbstractFactory.demo1.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo1.AbstractBlackHuman;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:25
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    public void getSex() {
        System.out.println("黑人男性");
    }
}
