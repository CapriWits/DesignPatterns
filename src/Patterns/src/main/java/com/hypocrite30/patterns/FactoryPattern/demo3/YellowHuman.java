package com.hypocrite30.patterns.FactoryPattern.demo3;

import com.hypocrite30.patterns.FactoryPattern.demo2.Human;

/**
 * @Description: 「多工厂模式」黄种人
 * @Author: Hypocrite30
 * @Date: 2021-4-20 17:15:58
 */
public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色人种皮肤颜色是黄色");
    }

    public void talk() {
        System.out.println("黄色人种说话");
    }
}