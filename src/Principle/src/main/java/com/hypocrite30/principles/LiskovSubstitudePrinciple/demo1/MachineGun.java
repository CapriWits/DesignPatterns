package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo1;

/**
 * @Description: 机枪类
 * @Author: Hypocrite30
 * @Date: 2021/4/16 21:41
 */
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("使用机枪类射击...");
    }
}
