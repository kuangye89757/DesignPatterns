package com.kuangye.patterns.builder;

/**
 * Created by wangshijie on 2016/9/7.
 */
public final class Student {

    private static volatile Student mInstance;

    private StudentConfig config;

    private Student(){}

    public static Student getInstance(){
        if(mInstance == null){
            synchronized (Student.class){
                if(mInstance == null){
                    mInstance = new Student();
                }
            }
        }
        return mInstance;
    }

    public void init(StudentConfig config){
        this.config = config;
        System.out.print(config.toString());
    }
}
