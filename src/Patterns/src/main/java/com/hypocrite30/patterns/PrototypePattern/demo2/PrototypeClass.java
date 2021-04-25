package com.hypocrite30.patterns.PrototypePattern.demo2;

/**
 * @Description: 「原型模式」通用源码
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:11
 */
public class PrototypeClass implements Cloneable {
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
