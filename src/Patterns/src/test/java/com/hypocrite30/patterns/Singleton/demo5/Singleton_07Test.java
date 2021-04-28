package com.hypocrite30.patterns.Singleton.demo5;


import org.junit.jupiter.api.Test;

/**
 * @Description: 「单例模式」「应用7」「枚举单例 线程安全」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/28 15:26
 */
class Singleton_07Test {
    @Test
    public void test() {
        Singleton_07.INSTANCE.test();
    }
}