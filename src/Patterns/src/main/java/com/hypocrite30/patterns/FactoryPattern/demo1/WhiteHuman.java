package com.hypocrite30.patterns.FactoryPattern.demo1;

/**
 * @Description: 「工厂模式」白人
 * @Author: Hypocrite30
 * @Date: 2021/4/19 22:48
 */
public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种皮肤颜色是白色");
    }

    public void talk() {
        System.out.println("白人说话");
    }
}
