package com.hypocrite30.patterns.BuilderPattern.demo1;

import java.util.ArrayList;

/**
 * @Description: 「建造者模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/24 19:18
 */
public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    // 设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
