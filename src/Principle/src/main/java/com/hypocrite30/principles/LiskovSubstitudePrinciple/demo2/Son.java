package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 演示「覆盖或实现父类的方法时输入参数可以被放大」的子类
 * @Author: Hypocrite30
 * @Date: 2021/4/16 22:41
 */
public class Son extends Father{
    // 放大输入参数类型
    //@Override 报错
    public Collection doSomething(Map map) {
        System.out.println("子类被调用...");
        return map.values();
    }
}
