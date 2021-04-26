package com.hypocrite30.patterns.Singleton.demo3;

/**
 * @Description: 「单例模式」「高并发环境」注意事项
 * @Author: Hypocrite30
 * @Date: 2021/4/26 20:39
 */
public class Singleton {
    private static Singleton singleton = null;

    //限制产生多个对象
    private Singleton() {
    }

    // 通过该方法获得实例对象
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
