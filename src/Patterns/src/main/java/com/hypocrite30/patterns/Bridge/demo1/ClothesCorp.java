package com.hypocrite30.patterns.Bridge.demo1;

/**
 * @Description: 「桥接模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/6 17:56
 */
public class ClothesCorp extends Corp {
    // 生产衣服了
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }
    // 卖服装
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }
    //赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
