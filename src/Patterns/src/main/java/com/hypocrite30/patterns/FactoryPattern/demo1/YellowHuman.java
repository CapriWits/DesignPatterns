package com.hypocrite30.patterns.FactoryPattern.demo1;

/**
 * @Description: 「工厂模式」黄种人
 * @Author: Hypocrite30
 * @Date: 2021/4/19 22:49
 */
public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色人种皮肤颜色是黄色");
    }

    public void talk() {
        System.out.println("黄色人种说话");
    }
}