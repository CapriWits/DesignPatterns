package com.hypocrite30.principles.InterfaceSegregationPrinciple;

/**
 * @Description: 「接口隔离原则」星探抽象类
 * @Author: Hypocrite30
 * @Date: 2021/4/17 21:43
 */
public abstract class AbstractSearcher {
    protected IGreatTemperamentGirl iGreatTemperamentGirl;
    protected IGoodBodyGirl iGoodBodyGirl;

    public AbstractSearcher(IGreatTemperamentGirl iGreatTemperamentGirl, IGoodBodyGirl iGoodBodyGirl) {
        this.iGreatTemperamentGirl = iGreatTemperamentGirl;
        this.iGoodBodyGirl = iGoodBodyGirl;
    }

    public AbstractSearcher(IGoodBodyGirl iGoodBodyGirl) {
        this.iGoodBodyGirl = iGoodBodyGirl;
    }

    public abstract void show(); // 列出美女信息
}
