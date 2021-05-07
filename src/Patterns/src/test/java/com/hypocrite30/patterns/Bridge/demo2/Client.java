package com.hypocrite30.patterns.Bridge.demo2;

import com.hypocrite30.patterns.Bridge.demo2.Impl.ConcreteImplementor1;
import com.hypocrite30.patterns.Bridge.demo2.Impl.RefinedAbstraction;
import org.junit.jupiter.api.Test;

/**
 * @Description: 「桥接模式」通用源码 测试
 * @Author: Hypocrite30
 * @Date: 2021/5/7 20:08
 */
class Client {
    @Test
    public void test() {
        Implementor imp = new ConcreteImplementor1(); //定义一个实现化角色
        Abstraction abs = new RefinedAbstraction(imp); // 定义一个抽象化角色
        abs.request(); // 执行行文
    }
}