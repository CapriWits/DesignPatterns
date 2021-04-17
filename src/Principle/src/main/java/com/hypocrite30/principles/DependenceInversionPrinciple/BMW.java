package com.hypocrite30.principles.DependenceInversionPrinciple;

/**
 * @Description: 「依赖倒置原则」宝马类
 * @Author: Hypocrite30
 * @Date: 2021/4/17 20:43
 */
public class BMW implements ICar{
    public void run() {
        System.out.println("BMW is running...");
    }
}
