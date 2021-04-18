package com.hypocrite30.principles.LawOfDemeter.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: 「迪米特法则」demo1测试
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:14
 */
class Client {
    @Test
    public void testLOD() {
        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader());
    }
}