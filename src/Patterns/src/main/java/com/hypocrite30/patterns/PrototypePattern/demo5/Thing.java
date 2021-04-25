package com.hypocrite30.patterns.PrototypePattern.demo5;

import java.util.ArrayList;

/**
 * @Description: 「原型模式」「clone与final两个冤家」案例
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:37
 */
public class Thing implements Cloneable {
    //定义一个私有变量
    private final ArrayList<String> arrayList = new ArrayList<String>();

    // @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
//            this.arrayList = (ArrayList<String>) this.arrayList.clone(); // error
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
