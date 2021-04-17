package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo1;

/**
 * @Description: 手枪类
 * @Author: Hypocrite30
 * @Date: 2021/4/16 21:38
 */
public class Handgun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("使用手枪射击...");
    }
}
