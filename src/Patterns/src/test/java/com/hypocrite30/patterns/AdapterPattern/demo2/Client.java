package com.hypocrite30.patterns.AdapterPattern.demo2;

import org.junit.jupiter.api.Test;

/**
 * @Description: 「适配器模式」通用源码
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:08
 */
class Client {
    @Test
    public void test() {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}