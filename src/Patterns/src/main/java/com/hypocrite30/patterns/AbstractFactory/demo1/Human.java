package com.hypocrite30.patterns.AbstractFactory.demo1;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:16
 */
public interface Human {
    // 每个人种都有相应的颜色
    void getColor();
    // 人类会说话
    void talk();
    // 每个人都有性别
    void getSex();
}
