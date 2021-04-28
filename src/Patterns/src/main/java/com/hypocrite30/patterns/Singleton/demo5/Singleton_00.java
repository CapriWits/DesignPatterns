package com.hypocrite30.patterns.Singleton.demo5;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: 「单例模式」「应用0」「静态类使用」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:33
 */
public class Singleton_00 {
    public static Map<String, String> cache = new ConcurrentHashMap<String, String>();
}
