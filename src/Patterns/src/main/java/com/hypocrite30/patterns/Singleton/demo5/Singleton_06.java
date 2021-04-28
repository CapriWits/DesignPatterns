package com.hypocrite30.patterns.Singleton.demo5;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description: 「单例模式」「应用6」「CAS「AtomicReference」(线程安全)」
 * @Author: Hypocrite30
 * @Date: 2021/4/28 14:59
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new
            AtomicReference<Singleton_06>();
    private static Singleton_06 instance;

    private Singleton_06() {
    }

    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance());
        // org.itstack.demo.design.Singleton_06 @ 2 b193f2d
        System.out.println(Singleton_06.getInstance());
        // org.itstack.demo.design.Singleton_06 @ 2 b193f2d
    }
}
