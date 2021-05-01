package com.hypocrite30.patterns.AdapterPattern.demo3.Impl;

import com.hypocrite30.patterns.AdapterPattern.demo3.IOuterUserHomeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 「适配器模式」适配器扩展
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:38
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
