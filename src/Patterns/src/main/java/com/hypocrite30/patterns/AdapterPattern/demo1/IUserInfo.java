package com.hypocrite30.patterns.AdapterPattern.demo1;

/**
 * @Description: 「适配器模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/1 17:19
 */
public interface IUserInfo {
    // 用户姓名
    public String getUserName();
    // 家庭地址
    public String getHomeAddress();
    // 手机号码
    public String getMobileNumber();
    // 办公电话
    public String getOfficeTelNumber();
    // 职位
    public String getJobPosition();
    // 家庭电话
    public String getHomeTelNumber();
}
