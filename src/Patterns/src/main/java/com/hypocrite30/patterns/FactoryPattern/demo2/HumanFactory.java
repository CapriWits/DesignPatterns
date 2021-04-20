package com.hypocrite30.patterns.FactoryPattern.demo2;

/**
 * @Description: 「简单工厂模式」人类工厂
 * @Author: Hypocrite30
 * @Date: 2021/4/20 17:14
 */
public class HumanFactory {
    // 改成静态的方法，「简单工厂方法模式」
    public static <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产出的人种
        Human human = null;
        try {
            //产生一个人种
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
