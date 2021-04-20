package com.hypocrite30.patterns.FactoryPattern.demo1;

/**
 * @Description: 「工厂模式」人类工厂类
 * @Author: Hypocrite30
 * @Date: 2021/4/19 22:51
 */
public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        //定义一个生产的人种
        try {
            //产生一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
