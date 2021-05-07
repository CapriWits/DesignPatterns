package com.hypocrite30.patterns.Bridge.demo2.Impl;

import com.hypocrite30.patterns.Bridge.demo2.Abstraction;
import com.hypocrite30.patterns.Bridge.demo2.Implementor;

/**
 * @Description: 「桥接模式」通用源码
 * @Author: Hypocrite30
 * @Date: 2021/5/7 20:05
 */
public class RefinedAbstraction extends Abstraction {
    //覆写构造函数
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }
    //修正父类的行为
    @Override
    public void request() {
        super.request();
        super.getImp().doAnything();
    }
}
