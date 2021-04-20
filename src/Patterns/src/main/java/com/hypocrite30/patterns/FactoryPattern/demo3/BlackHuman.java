package com.hypocrite30.patterns.FactoryPattern.demo3;

import com.hypocrite30.patterns.FactoryPattern.demo2.Human;

/**
 * @Description: 「多工厂模式」黑人
 * @Author: Hypocrite30
 * @Date: 2021-4-20 17:15:38
 */
public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色");
    }
    public void talk() {
        System.out.println("黑人说话");
    }
}
