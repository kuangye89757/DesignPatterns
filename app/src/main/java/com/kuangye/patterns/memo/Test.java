package com.kuangye.patterns.memo;

/**
 * Created by wangshijie on 2016/10/10.
 */
public class Test {
    public static void main(String[] args){

        CallOfDuty callOfDuty = new CallOfDuty();
        callOfDuty.play();//玩游戏

        CareTaker careTaker = new CareTaker();
        careTaker.archive(callOfDuty.createMemoto());//存档
        callOfDuty.quit();//退出游戏

        callOfDuty.restore(careTaker.getMemoto());//读档

    }
}
