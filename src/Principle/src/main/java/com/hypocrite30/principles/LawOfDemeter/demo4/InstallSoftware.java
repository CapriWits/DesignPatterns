package com.hypocrite30.principles.LawOfDemeter.demo4;

/**
 * @Description: 「迪米特法则」安装类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:42
 */
public class InstallSoftware {
    public void installWizard(Wizard wizard) {
        //直接调用
        wizard.installWizard();
    }
}
