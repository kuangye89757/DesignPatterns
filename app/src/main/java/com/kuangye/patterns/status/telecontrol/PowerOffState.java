package com.kuangye.patterns.status.telecontrol;

/**
 * Created by gaowei555 on 2016/8/29 15:03
 * E-mail fkfj555@163.com
 * Function 关机状态，此时只有开机功能是有效的
 */
public class PowerOffState implements TvState {
    private String str="未开启";

    @Override
    public String nextChannel() {
        return str;
    }

    @Override
    public String prevChannel() {
        return str;
    }

    @Override
    public String turnUp() {
        return str;
    }

    @Override
    public String turnDown() {
        return str;
    }
}
