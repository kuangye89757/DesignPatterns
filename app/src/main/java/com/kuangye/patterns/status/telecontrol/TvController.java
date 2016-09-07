package com.kuangye.patterns.status.telecontrol;

/**
 * Created by gaowei555 on 2016/8/29 15:14
 * E-mail fkfj555@163.com
 * Function
 */
public class TvController implements PowerController {
    TvState mTvState = new PowerOffState();

    public void setTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public String powerOn() {
        setTvState(new PowerOnState());
        return "已开启";
    }

    @Override
    public String powerOff() {
        setTvState(new PowerOffState());
        return "已关闭";
    }

    public String nextChannle() {
        return mTvState.nextChannel();
    }

    public String PrevChannel() {
        return mTvState.prevChannel();
    }

    public String turnUp() {
        return mTvState.turnUp();
    }

    public String turnDown() {
        return mTvState.turnDown();
    }
}
