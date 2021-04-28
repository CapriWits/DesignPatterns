package com.hypocrite30.patterns.Singleton.demo5;

/**
 * @Description: 「单例模式」「应用4」「使用类的内部类 线程安全」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:46
 */
public class Singleton_04 {
    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
