package com.hypocrite30.patterns.Bridge.demo1;

/**
 * @Description: 「桥接模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/6 18:02
 */
public class IPodCorp extends Corp {
    protected void produce() {
        System.out.println("生产IPod...");
    }
    protected void sell() {
        System.out.println("IPod畅销...");
    }
    public void makeMoney() {
        super.makeMoney();
        System.out.println("IPod赚钱...");
    }
}
