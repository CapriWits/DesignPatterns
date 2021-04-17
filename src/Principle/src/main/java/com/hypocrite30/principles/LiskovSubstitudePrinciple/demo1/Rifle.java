package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo1;

/**
 * @Description: 步枪类
 * @Author: Hypocrite30
 * @Date: 2021/4/16 21:40
 */
public class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("使用步枪射击...");
    }
}
