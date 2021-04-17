package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo1;

/**
 * @Description: 玩具枪
 * @Author: Hypocrite30
 * @Date: 2021/4/16 21:58
 */
public class ToyGun extends AbstractGun {
    @Override
    public void shoot() {
        // 玩具枪无法射击，所以方法做空实现
    }
}
