package com.kuangye.patterns.observer;

/**
 * Created by wangshijie on 2016/10/10.
 */
public interface IWatched {
    void registerWatch(IWatch watch);

    void unRegisterWatch(IWatch watch);

    void notifyWatches(String str);
}
