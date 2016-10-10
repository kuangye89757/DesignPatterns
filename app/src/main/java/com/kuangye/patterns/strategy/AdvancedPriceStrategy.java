package com.kuangye.patterns.strategy;

/**
 * Created by wangshijie on 2016/10/10.
 */
public class AdvancedPriceStrategy implements IPriceStrategy {
    @Override
    public void disCountStrategy() {
        System.out.println("高级会员优惠打折20%~!");
    }
}
