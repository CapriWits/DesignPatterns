package com.hypocrite30.patterns.BuilderPattern.demo2;

/**
 * @Description: 「建造者模式」抽象建造者
 * @Author: Hypocrite30
 * @Date: 2021/4/24 20:28
 */
public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPart();

    // 建造产品
    public abstract Product buildProduct();
}
