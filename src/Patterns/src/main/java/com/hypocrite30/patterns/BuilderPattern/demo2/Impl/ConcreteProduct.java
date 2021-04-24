package com.hypocrite30.patterns.BuilderPattern.demo2.Impl;

import com.hypocrite30.patterns.BuilderPattern.demo2.Builder;
import com.hypocrite30.patterns.BuilderPattern.demo2.Product;

/**
 * @Description: 「建造者模式」具体建造者
 * @Author: Hypocrite30
 * @Date: 2021/4/24 20:29
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();

    //设置产品零件
    public void setPart() {
        /** 产品类内的逻辑处理 */
    }

    //组建一个产品
    public Product buildProduct() {
        return product;
    }
}
