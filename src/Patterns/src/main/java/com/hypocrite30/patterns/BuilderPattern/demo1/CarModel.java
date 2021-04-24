package com.hypocrite30.patterns.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * @Description: 「建造者模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/24 18:39
 */
public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    // 模型开始跑动
    protected abstract void start();

    // 模型停下
    protected abstract void stop();

    // 模型鸣笛
    protected abstract void alarm();

    // 引擎响起
    protected abstract void engineBoom();

    // 汽车模型应该会跑，别管是人推的，还是电力驱动，总之要会跑
    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start(); // 启动汽车
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop(); //停止汽车
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm(); //喇叭开始叫了
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom(); //引擎开始轰鸣
            }
        }
    }

    //把传递过来的值传递到类内
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
