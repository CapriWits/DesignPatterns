package com.hypocrite30.patterns.Singleton.demo1;

/**
 * @Description: 「单例模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/26 20:20
 */
public class Emperor {
    private static final Emperor emperor = new Emperor(); // 初始化一个皇帝

    private Emperor() {
        // private构造方法，不会产生第二个皇帝
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝xxx");
    }
}
