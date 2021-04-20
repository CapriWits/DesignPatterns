package com.hypocrite30.patterns.FactoryPattern.demo5;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 「延迟初始化」延迟加载工厂类
 * @Author: Hypocrite30
 * @Date: 2021/4/20 22:24
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        //如果Map中已经有这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            //同时把对象放到缓存容器中
            prMap.put(type, product);
        }
        return product;
    }
}
