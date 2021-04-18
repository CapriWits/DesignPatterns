package com.hypocrite30.principles.LawOfDemeter.demo3;

/**
 * @Description: 「迪米特法则」安装类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:42
 */
public class InstallSoftware {
    public void installWizard(Wizard wizard) {
        int first = wizard.first();
        //根据first返回的结果，看是否需要执行second
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();
                if (third > 50) {
                    wizard.first();
                }
            }
        }
    }
}
