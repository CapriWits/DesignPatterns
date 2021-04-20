package com.hypocrite30.patterns.FactoryPattern.demo2;

/**
 * @Description: 「简单工厂模式」白人
 * @Author: Hypocrite30
 * @Date: 2021-4-20 17:15:53
 */
public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种皮肤颜色是白色");
    }

    public void talk() {
        System.out.println("白人说话");
    }
}
