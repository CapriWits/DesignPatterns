package com.hypocrite30.patterns.Singleton.demo5;

/**
 * @Description: 「单例模式」「应用1」「懒汉模式 线程不安全」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:37
 */
public class Singleton_01 {
    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_01();
        return instance;
    }
}
