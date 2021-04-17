package com.hypocrite30.principles.InterfaceSegregationPrinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: 「接口隔离原则」测试类
 * @Author: Hypocrite30
 * @Date: 2021/4/17 21:53
 */
class Client {

    @Test
    public void testIsp() {
        IGoodBodyGirl iGoodBodyGirl = new PrettyGirl("Majiko");
        IGreatTemperamentGirl iGreatTemperamentGirl = new PrettyGirl("Taylor");
        AbstractSearcher searcher = new Searcher(iGreatTemperamentGirl, iGoodBodyGirl);
        searcher.show();
    }

}