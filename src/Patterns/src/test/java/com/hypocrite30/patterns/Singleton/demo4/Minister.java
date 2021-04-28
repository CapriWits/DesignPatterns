package com.hypocrite30.patterns.Singleton.demo4;

import org.junit.jupiter.api.Test;

/**
 * @Description: 「单例模式」拓展 测试
 * @Author: Hypocrite30
 * @Date: 2021/4/26 20:56
 */
class Minister {
    @Test
    public void test() {
        //定义5个大臣
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}