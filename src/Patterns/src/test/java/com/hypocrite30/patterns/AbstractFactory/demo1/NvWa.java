package com.hypocrite30.patterns.AbstractFactory.demo1;

import com.hypocrite30.patterns.AbstractFactory.demo1.Impl.FemaleFactory;
import com.hypocrite30.patterns.AbstractFactory.demo1.Impl.MaleFactory;
import org.junit.jupiter.api.Test;

/**
 * @Description: 「抽象工厂模式」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:37
 */
class NvWa {
    @Test
    public void test() {
        // 第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        // 第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        // 生产线建立完毕，开始造人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("\n---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }
}