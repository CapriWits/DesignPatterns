package com.hypocrite30.principles.DependenceInversionPrinciple;

/**
 * @Description: 「依赖倒置原则」驾驶动作抽象
 * @Author: Hypocrite30
 * @Date: 2021/4/17 20:41
 */
public interface IDriver {
    public void drive(ICar car); // 驾驶
}
