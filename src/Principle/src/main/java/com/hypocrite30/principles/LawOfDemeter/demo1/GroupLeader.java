package com.hypocrite30.principles.LawOfDemeter.demo1;

import java.util.List;

/**
 * @Description: 「迪米特法则」体育委员类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:11
 */
public class GroupLeader {
    //清查女生数量
    public void countGirls(List<Girl> listGirls) {
        System.out.println("女生数量是：" + listGirls.size());
    }
}
