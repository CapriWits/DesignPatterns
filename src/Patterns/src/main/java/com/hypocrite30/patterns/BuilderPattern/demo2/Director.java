package com.hypocrite30.patterns.BuilderPattern.demo2;

import com.hypocrite30.patterns.BuilderPattern.demo2.Impl.ConcreteProduct;

/**
 * @Description: 「建造者模式」导演类
 * @Author: Hypocrite30
 * @Date: 2021/4/24 20:51
 */
public class Director {
    private Builder builder = new ConcreteProduct();

    //构建不同的产品
    public Product getAProduct() {
        builder.setPart();
        /** 设置不同的零件，产生不同的产品 */
        return builder.buildProduct();
    }
}
