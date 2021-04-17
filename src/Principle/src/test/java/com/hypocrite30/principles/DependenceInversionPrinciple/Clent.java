package com.hypocrite30.principles.DependenceInversionPrinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: 「依赖倒置原则」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/17 20:44
 */
class Clent {

    @Test
    public void testDIP() {
        IDriver driver = new Driver();
        ICar car = new Benz();
        driver.drive(car);
    }

}