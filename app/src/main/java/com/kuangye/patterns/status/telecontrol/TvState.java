package com.kuangye.patterns.status.telecontrol;

/**
 * Created by gaowei555 on 2016/8/29 14:59
 * E-mail fkfj555@163.com
 * Function 电视状态接口
 */
public interface TvState {
    /**
     * 下一个
     */
    public String nextChannel(

    );

    /**
     * 上一个
     */
    public String prevChannel();

    /**
     * 增加
     */
    public String turnUp();

    /**
     * 减少
     */
    public String turnDown();
}
