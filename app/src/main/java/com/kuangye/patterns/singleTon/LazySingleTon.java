package com.kuangye.patterns.singleTon;

/**
 * 懒汉式.(不建议)
 */
public class LazySingleTon {
    private static LazySingleTon mInstance;

    private LazySingleTon(){}

    /**
     * 由于方法加了同步关键字 在多线程时保证唯一性
     *      优点:只有在第一次使用时初始化
     *      缺点:第一次初始化完成之后 每次调用都会同步导致资源浪费
     * @return
     */
    public synchronized static LazySingleTon getInstance(){
        if(mInstance==null){
            mInstance = new LazySingleTon();
        }
        return mInstance;
    }
}
