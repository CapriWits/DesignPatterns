package com.hypocrite30.patterns.PrototypePattern.demo3;

import org.junit.jupiter.api.Test;

/**
 * @Description: 「原型模式」「构造函数不会被执行」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:20
 */
class Client {
    @Test
    public void test() {
        //产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}