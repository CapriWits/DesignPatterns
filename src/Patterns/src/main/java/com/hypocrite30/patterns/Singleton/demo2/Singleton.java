package com.hypocrite30.patterns.Singleton.demo2;

/**
 * @Description: 「单例模式」通用代码
 * @Author: Hypocrite30
 * @Date: 2021/4/26 20:27
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象
    private Singleton() {
    }

    // 通过该方法获得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    //类中其他方法，尽量是「static」
    public static void doSomething() {
    }
}
