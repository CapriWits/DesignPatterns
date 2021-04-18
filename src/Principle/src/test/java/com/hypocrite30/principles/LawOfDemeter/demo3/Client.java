package com.hypocrite30.principles.LawOfDemeter.demo3;

import org.junit.jupiter.api.Test;


/**
 * @Description: 「迪米特法则」demo3测试
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:45
 */
class Client {
    @Test
    public void testLOD() {
        InstallSoftware invoker = new InstallSoftware();
        invoker.installWizard(new Wizard());
    }
}