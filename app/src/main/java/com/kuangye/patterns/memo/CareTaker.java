package com.kuangye.patterns.memo;

/**
 * 管理员.
 */
public class CareTaker {
    private Memoto memoto;

    /**
     * 读档
     * @return
     */
    public Memoto getMemoto() {
        return memoto;
    }

    /**
     * 存档
      * @param memoto
     */
    public void archive(Memoto memoto) {
        this.memoto = memoto;
    }



}
