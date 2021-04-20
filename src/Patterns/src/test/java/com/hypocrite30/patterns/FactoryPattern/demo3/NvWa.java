package com.hypocrite30.patterns.FactoryPattern.demo3;

import org.junit.jupiter.api.Test;

/**
 * @Description: 「多工厂模式」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/20 17:58
 */
class NvWa {
    @Test
    public void test() {
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (Human) (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("\n--造出的第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}