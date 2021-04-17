package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo2;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Description: 演示「覆盖或实现父类的方法时输入参数可以被放大」的父类
 * @Author: Hypocrite30
 * @Date: 2021/4/16 22:39
 */
public class Father {
    public Collection doSomething(HashMap map) {
        System.out.println("父类被调用....");
        return map.values();
    }
}
