package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo1;

/**
 * @Description: 士兵类，使用枪
 * @Author: Hypocrite30
 * @Date: 2021/4/16 21:43
 */
public class Soldier {
    private AbstractGun abstractGun;

    // 配枪
    public void setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    public void killEnemy() {
        System.out.println("士兵准备击杀敌人...");
        abstractGun.shoot();
    }
}
