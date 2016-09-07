package com.kuangye.patterns.singleTon;

/**
 * 使用静态内部类单例模式.
 *      当第一次加载时StaticSingleTon不会初始化SingleTonHolder
 *          只有使用第一次使用getInstance()会加载SingleTonHolder;
 *          保证线程安全和对象的一致性;且有延时加载效果
 */
public class StaticSingleTon {
    private StaticSingleTon(){}

    public static StaticSingleTon getInstance(){
        return SingleTonHolder.mInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingleTonHolder{
        private static final StaticSingleTon mInstance = new StaticSingleTon();
    }
}
