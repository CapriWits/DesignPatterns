package com.hypocrite30.patterns.Bridge.demo1;

import org.junit.jupiter.api.Test;

/**
 * @Description: 「桥接模式」测试
 * @Author: Hypocrite30
 * @Date: 2021/5/6 17:57
 */
class Client {
    @Test
    public void test() {
        System.out.println("-------房地产公司是这样运行的-------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }

    @Test
    public void test1() {
        System.out.println("-------房地产公司是按这样运行的-------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("-------山寨公司是按这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}