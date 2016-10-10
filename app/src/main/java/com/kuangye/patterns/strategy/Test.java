package com.kuangye.patterns.strategy;

/**
 * Created by wangshijie on 2016/10/10.
 */
public class Test {


    public static void main(String[] args) {
        PriceContext context;

        System.out.println("普通人");
        context = new PriceContext(new OrdinaryPriceStrategy());
        context.disCount();
        System.out.println("===================================");

        System.out.println("中级会员");
        context = new PriceContext(new IntermediatePriceStrategy());
        context.disCount();
        System.out.println("===================================");

        System.out.println("高级会员");
        context = new PriceContext(new AdvancedPriceStrategy());
        context.disCount();
        System.out.println("===================================");
    }
}
