package com.hypocrite30.patterns.AdapterPattern.demo3.Impl;

import com.hypocrite30.patterns.AdapterPattern.demo3.IOuterUserBaseInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 「适配器模式」适配器扩展
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:37
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }
}
