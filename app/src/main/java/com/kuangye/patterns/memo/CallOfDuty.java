package com.kuangye.patterns.memo;

/**
 * 游戏类--使命召唤.
 */
public class CallOfDuty {
    private int mCheckPoint = 1;//关卡
    private int mLifeValue = 100;//血量
    private String mWeapon = "沙漠之鹰";//武器

    /**
     * 玩游戏
     */
    public void play(){
        System.out.println("=============游戏开始==============");
        mLifeValue-=10;
        System.out.println("=============关卡进度,当前"+String.format("第%d关",mCheckPoint)+"==============");
        System.out.println("=============受到攻击,当前血量"+String.format("%d",mLifeValue)+"==============");
        mCheckPoint++;
        System.out.println("=============进度升级,当前"+String.format("第%d关",mCheckPoint)+"==============");
    }

    public void quit(){
        System.out.println("=============退出前属性: "+this.toString()+"==============");
        System.out.println("=============退出游戏==============");
    }

    /**
     * 创建备忘录
     * @return
     */
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    /**
     * 恢复游戏
     * @param memoto
     */
    public void restore(Memoto memoto){
        mCheckPoint = memoto.mCheckPoint;
        mLifeValue = memoto.mLifeValue;
        mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性:"+this.toString());
    }


    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
