package com.kuangye.patterns.memo;

/**
 * 备忘录--存档信息.
 */
public class Memoto {
    public int mCheckPoint;//关卡
    public int mLifeValue;//血量
    public String mWeapon;//武器

    @Override
    public String toString() {
        return "Memoto{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
