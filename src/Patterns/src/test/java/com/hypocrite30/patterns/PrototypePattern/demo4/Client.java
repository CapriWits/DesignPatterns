package com.hypocrite30.patterns.PrototypePattern.demo4;


import org.junit.jupiter.api.Test;

/**
 * @Description: 「原型模式」「浅拷贝」案例
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:25
 */
class Client {
    @Test
    public void test() {
        //产生一个对象
        Thing thing = new Thing();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }

    @Test
    public void test2() {
        //产生一个对象
        Thing2 thing = new Thing2();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing2 cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}