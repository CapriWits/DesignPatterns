package com.hypocrite30.principles.LawOfDemeter.demo4;

import org.junit.jupiter.api.Test;


/**
 * @Description: 「迪米特法则」demo4测试
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:45
 */
class Client {
    @Test
    public void testLOD() {
        InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }
}