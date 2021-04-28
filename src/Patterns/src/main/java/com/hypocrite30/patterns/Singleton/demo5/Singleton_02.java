package com.hypocrite30.patterns.Singleton.demo5;

/**
 * @Description: 「单例模式」「应用2」「懒汉模式 线程安全」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:39
 */
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
