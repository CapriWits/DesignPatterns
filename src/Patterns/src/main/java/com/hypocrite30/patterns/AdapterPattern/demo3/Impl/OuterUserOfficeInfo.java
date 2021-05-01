package com.hypocrite30.patterns.AdapterPattern.demo3.Impl;

import com.hypocrite30.patterns.AdapterPattern.demo3.IOuterUserOfficeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 「适配器模式」适配器扩展
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:39
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
