package com.kuangye.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangshijie on 2016/10/10.
 */
public class Watched implements IWatched {

    private List<IWatch> watches = new ArrayList<>();

    @Override
    public void registerWatch(IWatch watch) {
        watches.add(watch);
    }

    @Override
    public void unRegisterWatch(IWatch watch) {
        watches.remove(watch);
    }

    @Override
    public void notifyWatches(String str) {
        for (IWatch watch : watches) {
            watch.update(str);
        }
    }
}
