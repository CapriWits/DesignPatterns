package com.hypocrite30.patterns.FactoryPattern.demo1;

/**
 * @Description: 「工厂模式」黑人
 * @Author: Hypocrite30
 * @Date: 2021/4/19 22:47
 */
public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色");
    }
    public void talk() {
        System.out.println("黑人说话");
    }
}
