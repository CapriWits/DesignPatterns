package com.hypocrite30.principles.LiskovSubstitudePrinciple.demo1;

import org.junit.jupiter.api.Test;

/**
 * @Description: 里式替换原则测试
 * @Author: Hypocrite30
 * @Date: 2021/4/16 21:48
 */
class ClientTest {

    @Test
    public void testLSP() {
        Soldier soldier = new Soldier();
        soldier.setAbstractGun(new Rifle());
        soldier.killEnemy();
    }

}