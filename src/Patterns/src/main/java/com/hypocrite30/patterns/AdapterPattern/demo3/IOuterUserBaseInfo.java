package com.hypocrite30.patterns.AdapterPattern.demo3;

import java.util.Map;

/**
 * @Description: 「适配器模式」适配器扩展
 * @Author: Hypocrite30
 * @Date: 2021/5/1 18:34
 */
public interface IOuterUserBaseInfo {
    public Map getUserBaseInfo(); //基本信息，比如名称、性别、手机号码等
}
