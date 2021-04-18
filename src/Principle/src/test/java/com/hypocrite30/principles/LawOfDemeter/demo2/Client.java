package com.hypocrite30.principles.LawOfDemeter.demo2;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Description: 「迪米特法则」demo2测试
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:25
 */
class Client {
    @Test
    public void testLOD() {
        //产生一个女生群体
        List<Girl> listGirls = new ArrayList<Girl>();
        // 初始化女生
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        //老师发布命令
        teacher.commond(new GroupLeader(listGirls));
    }
}