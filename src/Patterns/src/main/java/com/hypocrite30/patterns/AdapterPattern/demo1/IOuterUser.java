package com.hypocrite30.patterns.AdapterPattern.demo1;

import java.util.Map;

/**
 * @Description: 「适配器模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/1 17:30
 */
public interface IOuterUser {
    //基本信息，如名称、性别、手机号码等
    public Map getUserBaseInfo();
    // 工作区域信息
    public Map getUserOfficeInfo();
    // 用户的家庭信息
    public Map getUserHomeInfo();
}
