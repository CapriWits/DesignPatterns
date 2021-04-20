package com.hypocrite30.patterns.FactoryPattern.demo1;

/**
 * @Description: 「工厂模式」人类抽象
 * @Author: Hypocrite30
 * @Date: 2021/4/19 22:45
 */
public interface Human {
    // 每个人种的皮肤都有相应的颜色
    public void getColor();
    // 人类会说话
    public void talk();
}
