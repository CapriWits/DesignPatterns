package com.hypocrite30.principles.DependenceInversionPrinciple;

/**
 * @Description: 「依赖倒置原则」奔驰类
 * @Author: Hypocrite30
 * @Date: 2021/4/17 20:43
 */
public class Benz implements ICar{
    public void run() {
        System.out.println("Benz is running...");
    }
}
