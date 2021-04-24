package com.hypocrite30.patterns.BuilderPattern.demo1;

import com.hypocrite30.patterns.BuilderPattern.demo1.Impl.BenzBuilder;
import com.hypocrite30.patterns.BuilderPattern.demo1.Impl.BenzModel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @Description: 「建造者模式」引例测试
 * @Author: Hypocrite30
 * @Date: 2021/4/24 19:10
 */
class Client {
    @Test
    public void test() {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
        // 客户要求，run的时候先发动引擎
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        //我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();
    }

    @Test
    public void testBuilder() {
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        // 把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        // 制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        // 奔驰车跑一下看看
        benz.run();
    }

    @Test
    public void testDirector() {
        Director director = new Director();
        for (int i = 0; i < 10000; i++) { //1万辆A类型的奔驰车
            director.getABenzModel().run();
        }
        for (int i = 0; i < 1000000; i++) { //100万辆B类型的奔驰车
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 10000000; i++) { //1000万辆C类型的宝马车
            director.getCBMWModel().run();
        }
    }
}