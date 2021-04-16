package com.hypocrite30.principles.OpenClosePrinciple;


import org.junit.jupiter.api.Test;

/**
 * @Description: 开闭原则测试
 * @Author: Hypocrite30
 * @Date: 2021/4/15 22:16
 */
class OpenClosePrinciple {

    @Test
    public void test1() {
        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 2.创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
        //3.将皮肤设置到输入法中
        input.setSkin(skin);
        //4.显示皮肤
        input.display();
    }

    @Test
    public void test2() {
        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 2.创建皮肤对象
        HeimaSkin skin = new HeimaSkin();
        //3.将皮肤设置到输入法中
        input.setSkin(skin);
        //4.显示皮肤
        input.display();
    }

}