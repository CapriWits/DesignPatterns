package com.hypocrite30.patterns.FactoryPattern.demo4;

import java.lang.reflect.Constructor;

/**
 * @Description: 「工厂模式替代单例模式」工厂类
 * @Author: Hypocrite30
 * @Date: 2021/4/20 22:12
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName()); //获得无参构造
            Constructor constructor = cl.getDeclaredConstructor();
            // 设置无参构造是可访问的 「暴力反射」
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) { //异常处理
        }
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}
