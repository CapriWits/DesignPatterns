package com.hypocrite30.patterns.Singleton.demo5;

/**
 * @Description: 「单例模式」「应用3」「饿汉模式 线程安全」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:41
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }
}
