package com.hypocrite30.principles.OpenClosePrinciple;

/**
 * @Description: 搜狗输入法
 * @Author: Hypocrite30
 * @Date: 2021/4/15 22:14
 */
public class SougouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
