package com.hypocrite30.patterns.Singleton.demo5;

/**
 * @Description: 「单例模式」「应用5」「双重锁校验 线程安全」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:51
 */
public class Singleton_05 {
    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance() {
        if (null != instance) return instance;
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
