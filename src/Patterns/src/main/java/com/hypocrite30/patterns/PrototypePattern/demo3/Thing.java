package com.hypocrite30.patterns.PrototypePattern.demo3;

/**
 * @Description: 「原型模式」「构造函数不会被执行」案例
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:20
 */
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
