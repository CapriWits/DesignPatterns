package com.hypocrite30.principles.DependenceInversionPrinciple;

/**
 * @Description: 「依赖倒置原则」司机实现驾驶动作
 * @Author: Hypocrite30
 * @Date: 2021/4/17 20:37
 */
public class Driver implements IDriver{
    public void drive(ICar car) {
        car.run();
    }
}
