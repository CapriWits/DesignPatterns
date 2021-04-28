package com.hypocrite30.patterns.Singleton.demo1;

import org.junit.jupiter.api.Test;

/**
 * @Description: 「单例模式」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/26 20:22
 */
class Minister {
    @Test
    public void test() {
        // 三天都是同一个皇帝
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}