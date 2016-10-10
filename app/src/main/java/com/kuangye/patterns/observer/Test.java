package com.kuangye.patterns.observer;

/**
 * Created by wangshijie on 2016/10/10.
 */
public class Test {

    public static void main(String[] args){
        IWatch watch = new Watch();
        IWatch watch1 = new Watch();
        IWatch watch2 = new Watch();

        IWatched watched = new Watched();
        watched.registerWatch(watch);
        watched.registerWatch(watch1);
        watched.registerWatch(watch2);

        watched.notifyWatches("呵呵呵");

    }

}
