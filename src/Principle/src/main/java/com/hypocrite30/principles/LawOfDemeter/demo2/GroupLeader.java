package com.hypocrite30.principles.LawOfDemeter.demo2;

import java.util.List;

/**
 * @Description: 「迪米特法则」体育委员类
 * @Author: Hypocrite30
 * @Date: 2021/4/18 21:11
 */
public class GroupLeader {
    private List<Girl> listGirls;
    // 有参构造传入女生
    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }
    // 清查女生数量
    public void countGirls() {
        System.out.println("女生数量是：" + this.listGirls.size());
    }
}
