package com.hypocrite30.patterns.FactoryPattern.demo5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: 「延迟初始化」测试
 * @Author: Hypocrite30
 * @Date: 2021/4/21 12:26
 */
class ProductFactoryTest {
    @Test
    public void test() throws Exception {
        Product ProductObj1 = ProductFactory.createProduct("Product1");
        Product ProductObj2 = ProductFactory.createProduct("Product1");
        System.out.println(ProductObj1 == ProductObj2); // true

        Product product2 = ProductFactory.createProduct("Product2");
        System.out.println(ProductObj1 == product2); // false
    }
}