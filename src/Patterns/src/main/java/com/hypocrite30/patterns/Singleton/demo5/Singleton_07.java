package com.hypocrite30.patterns.Singleton.demo5;

/**
 * @Description: 「单例模式」「应用7」「枚举单例 线程安全」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 15:05
 */
public enum Singleton_07 {
    INSTANCE;
    public void test() {
        System.out.println("hi~");
    }
}
