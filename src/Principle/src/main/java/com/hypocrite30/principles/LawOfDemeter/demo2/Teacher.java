package com.hypocrite30.principles.LawOfDemeter.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 「迪米特法则」老师类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:09
 */
public class Teacher {
    public void commond(GroupLeader groupLeader) {
        //告诉体育委员开始执行清查任务
        groupLeader.countGirls();
    }
}
