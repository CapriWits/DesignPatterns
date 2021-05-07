package com.hypocrite30.patterns.Bridge.demo1;

/**
 * @Description: 「桥接模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/6 17:54
 */
public class HouseCorp extends Corp {
    // 盖房子
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }
    // 卖房子
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }
    // 计算利润
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱...");
    }
}
