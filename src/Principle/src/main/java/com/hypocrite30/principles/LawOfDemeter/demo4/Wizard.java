package com.hypocrite30.principles.LawOfDemeter.demo4;

import java.util.Random;

/**
 * @Description: 「迪米特法则」导向类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:41
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());
    public int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }
    public int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }
    public int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
    //软件安装过程
    public void installWizard() {
        int first = this.first();
        //根据first返回的结果，看是否需要执行 second
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.first();
                }
            }
        }
    }
}
