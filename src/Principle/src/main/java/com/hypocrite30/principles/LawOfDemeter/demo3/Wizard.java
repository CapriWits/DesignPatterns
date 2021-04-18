package com.hypocrite30.principles.LawOfDemeter.demo3;

import java.util.Random;

/**
 * @Description: 「迪米特法则」导向类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:41
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());
    //第一步
    public int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }
    //第二步
    public int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }
    //第三个方法
    public int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
}
