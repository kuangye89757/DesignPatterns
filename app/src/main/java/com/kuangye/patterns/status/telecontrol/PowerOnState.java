package com.kuangye.patterns.status.telecontrol;


/**
 * Created by gaowei555 on 2016/8/29 15:05
 * E-mail fkfj555@163.com
 * Function 开机状态，此时再出发开机功能不做任何操作
 */
public class PowerOnState implements TvState {
    private String str;

    @Override
    public String nextChannel() {
        str = "下一个";
        return str;
    }

    @Override
    public String prevChannel() {
        str = "上一个";
        return str;
    }

    @Override
    public String turnUp() {
        str = "增加";
        return str;
    }

    @Override
    public String turnDown() {
        str = "减少";
        return str;
    }
}
