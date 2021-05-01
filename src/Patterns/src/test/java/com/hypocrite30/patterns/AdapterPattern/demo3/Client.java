package com.hypocrite30.patterns.AdapterPattern.demo3;

import com.hypocrite30.patterns.AdapterPattern.demo1.IUserInfo;
import com.hypocrite30.patterns.AdapterPattern.demo3.Impl.OuterUserBaseInfo;
import com.hypocrite30.patterns.AdapterPattern.demo3.Impl.OuterUserHomeInfo;
import com.hypocrite30.patterns.AdapterPattern.demo3.Impl.OuterUserOfficeInfo;
import org.junit.jupiter.api.Test;

/**
 * @Description: 「适配器模式」「适配器扩展」 测试
 * @Author: Hypocrite30
 * @Date: 2021/5/1 20:11
 */
class Client {
    @Test
    public void test() {
        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        // 传递三个对象
        IUserInfo iUserInfo = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        //从数据库中查到10个
        for (int i = 0; i < 10; i++) {
            iUserInfo.getMobileNumber();
        }
    }
}