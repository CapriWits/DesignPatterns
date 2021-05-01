package com.hypocrite30.patterns.AdapterPattern.demo1;

import com.hypocrite30.patterns.AdapterPattern.demo1.impl.OuterUserInfo;
import com.hypocrite30.patterns.AdapterPattern.demo1.impl.UserInfo;
import org.junit.jupiter.api.Test;

/**
 * @Description: 「适配器模式」测试
 * @Author: Hypocrite30
 * @Date: 2021/5/1 17:45
 */
class Client {
    @Test
    public void test1() {
        // 没有与外系统连接的时候，是这样写的
        IUserInfo userInfo = new UserInfo();
        // 从数据库中查到10个
        for (int i = 0; i < 10; i++) {
            userInfo.getMobileNumber();
        }
    }

    @Test
    public void test2() {
        // 没有与外系统连接的时候，是这样写的
        IUserInfo userInfo = new OuterUserInfo(); // 仅仅只用改动这里
        // 从数据库中查到10个
        for (int i = 0; i < 10; i++) {
            userInfo.getMobileNumber();
        }
    }
}