package com.kuangye.patterns.strategy;

/**
 * 普通价格方案.
 */
public class OrdinaryPriceStrategy implements IPriceStrategy{

    @Override
    public void disCountStrategy() {
        System.out.println("普通会员没有打折优惠~!");
    }
}
