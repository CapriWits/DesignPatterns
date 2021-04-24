package com.hypocrite30.patterns.BuilderPattern.demo1.Impl;

import com.hypocrite30.patterns.BuilderPattern.demo1.CarBuilder;
import com.hypocrite30.patterns.BuilderPattern.demo1.CarModel;

import java.util.ArrayList;

/**
 * @Description: 「建造者模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/24 19:19
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    public CarModel getCarModel() {
        return this.benz;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
