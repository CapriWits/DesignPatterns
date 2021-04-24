package com.hypocrite30.patterns.BuilderPattern.demo1.Impl;

import com.hypocrite30.patterns.BuilderPattern.demo1.CarBuilder;
import com.hypocrite30.patterns.BuilderPattern.demo1.CarModel;

import java.util.ArrayList;

/**
 * @Description: 「建造者模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/24 19:20
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    public CarModel getCarModel() {
        return this.bmw;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
