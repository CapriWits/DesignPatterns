package com.hypocrite30.principles.InterfaceSegregationPrinciple;

/**
 * @Description: 「接口隔离原则」美女实现类
 * @Author: Hypocrite30
 * @Date: 2021/4/17 21:39
 */
public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl{
    private String name; // 美女的名字

    public PrettyGirl(String name) {
        this.name = name;
    }

    public void goodLooking() {
        System.out.println(name + " has good looking");
    }

    public void niceFigure() {
        System.out.println(name + " has nice figure");
    }

    public void greatTemperament() {
        System.out.println(name + " has great temperament");
    }
}
