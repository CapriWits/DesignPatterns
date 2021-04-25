package com.hypocrite30.patterns.PrototypePattern.demo4;

import java.util.ArrayList;

/**
 * @Description: 「原型模式」「深拷贝」案例
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:29
 */
public class Thing2 implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public Thing2 clone() {
        Thing2 thing = null;
        try {
            thing = (Thing2) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
