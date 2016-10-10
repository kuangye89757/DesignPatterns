package com.kuangye.patterns.strategy;

/**
 * 价格环境 -- 持有Strategy引用.
 */
public class PriceContext {

    private IPriceStrategy priceStrategy;

    public PriceContext(IPriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    /**
     * 打折
     */
    public void disCount(){
        priceStrategy.disCountStrategy();
    }
}
