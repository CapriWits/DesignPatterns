package com.hypocrite30.principles.InterfaceSegregationPrinciple;

/**
 * @Description: 「接口隔离原则」星探实现类
 * @Author: Hypocrite30
 * @Date: 2021/4/17 21:50
 */
public class Searcher extends AbstractSearcher{
    public Searcher(IGreatTemperamentGirl iGreatTemperamentGirl, IGoodBodyGirl iGoodBodyGirl) {
        super(iGreatTemperamentGirl, iGoodBodyGirl);
    }

    public Searcher(IGoodBodyGirl iGoodBodyGirl) {
        super(iGoodBodyGirl);
    }

    public void show() {
        iGoodBodyGirl.goodLooking();
        iGoodBodyGirl.niceFigure();
        iGreatTemperamentGirl.greatTemperament();
    }
}
