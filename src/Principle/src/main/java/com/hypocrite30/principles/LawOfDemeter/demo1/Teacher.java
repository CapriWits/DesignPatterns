package com.hypocrite30.principles.LawOfDemeter.demo1;

import java.util.*;

/**
 * @Description: 「迪米特法则」老师类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:09
 */
public class Teacher {
    public void commond(GroupLeader groupLeader) {
        List<Girl> listGirls = new ArrayList();
        //初始化女生
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        //告诉体育委员开始执行清查任务
        groupLeader.countGirls(listGirls);
    }
}
