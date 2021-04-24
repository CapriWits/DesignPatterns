package com.hypocrite30.patterns.AbstractFactory.demo1;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:17
 */
public abstract class AbstractWhiteHuman implements Human{
    //白色人种的皮肤颜色是白色的
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }
    //白色人种讲话
    public void talk() {
        System.out.println("白色人种会说话");
    }
}
