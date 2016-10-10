package com.kuangye.patterns.observer;

/**
 * 具体观察者.
 */
public class Watch implements IWatch {

    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
