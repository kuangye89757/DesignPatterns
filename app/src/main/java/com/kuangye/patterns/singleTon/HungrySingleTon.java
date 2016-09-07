package com.kuangye.patterns.singleTon;

/**
 * 饿汉式.
 */
public class HungrySingleTon {
    private static final HungrySingleTon mInstance = new HungrySingleTon();

    /**私有构造*/
    private HungrySingleTon(){}

    public static HungrySingleTon getInstance(){
        return mInstance;
    }
}
