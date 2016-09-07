package com.kuangye.patterns.singleTon;

/**
 * Created by wangshijie on 2016/9/7.
 */
public class Test {

    public static void main(String[] args){

        /**饿汉式*/
        HungrySingleTon singleTon1 =  HungrySingleTon.getInstance();
        HungrySingleTon singleTon2 =  HungrySingleTon.getInstance();

        System.out.println("饿汉式 -->" +singleTon1);
        System.out.println("饿汉式 -->" +singleTon2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleTon lazySingleTon = LazySingleTon.getInstance();
                System.out.println("懒汉式 -->" +lazySingleTon);

                DCLSingleTon dclSingleTon = DCLSingleTon.getInstance();
                System.out.println("DCL -->" +dclSingleTon);

                StaticSingleTon staticSingleTon = StaticSingleTon.getInstance();
                System.out.println("静态 -->" +staticSingleTon);
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleTon lazySingleTon = LazySingleTon.getInstance();
                System.out.println("懒汉式 -->" +lazySingleTon);

                DCLSingleTon dclSingleTon = DCLSingleTon.getInstance();
                System.out.println("DCL -->" +dclSingleTon);

                StaticSingleTon staticSingleTon = StaticSingleTon.getInstance();
                System.out.println("静态 -->" +staticSingleTon);
            }
        });

        thread2.start();
        LazySingleTon lazySingleTon = LazySingleTon.getInstance();
        System.out.println("懒汉式 -->" +lazySingleTon);
        thread1.start();

        StaticSingleTon staticSingleTon = StaticSingleTon.getInstance();
        System.out.println("静态 -->" +staticSingleTon);

        DCLSingleTon dclSingleTon = DCLSingleTon.getInstance();
        System.out.println("DCL -->" +dclSingleTon);

    }
}
