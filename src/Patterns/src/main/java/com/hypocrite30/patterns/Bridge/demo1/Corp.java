package com.hypocrite30.patterns.Bridge.demo1;

/**
 * @Description: 「桥接模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/6 17:52
 */
public abstract class Corp {
    protected abstract void produce(); // 生产产品
    protected abstract void sell(); // 销售
    public void makeMoney() {
        // 先生产，再销售，从中获利
        this.produce();
        this.sell();
    }
}
