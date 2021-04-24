package com.hypocrite30.patterns.AbstractFactory.demo1;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:19
 */
public abstract class AbstractBlackHuman implements Human{
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    public void talk() {
        System.out.println("黑人会说话");
    }
}
