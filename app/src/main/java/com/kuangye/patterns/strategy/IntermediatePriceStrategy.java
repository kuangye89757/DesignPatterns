package com.kuangye.patterns.strategy;

/**
 * Created by wangshijie on 2016/10/10.
 */
public class IntermediatePriceStrategy implements IPriceStrategy {

    @Override
    public void disCountStrategy() {
        System.out.println("中级会员优惠打折10%~!");
    }
}
