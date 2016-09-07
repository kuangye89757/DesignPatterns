package com.kuangye.patterns.singleTon;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Double Check Lock 双检查锁方式.
 *     线程在执行new的时候底层做了3件事:
 *         1.给DCLSingleTon的实例分配内存
 *         2.调用DCLSingleTon的构造方法,初始化成员
 *         3.将mInstance对象指向分配的内存地址
 *
 *     而JDK允许处理器乱序执行,Cache或寄存器到主内存回写顺序无法保证
 *      即2和3的步骤可以乱序
 *     若线程1先执行完步骤3,步骤2未完成;由于mInstance不为空导致线程2直接取走使用会报错
 *      故JDK1.5之后使用volatile关键字保证mInstance对象每次从主内存读取保证一致性
 *
 *      但在高并发环境下还是有概率发生缺陷,不过一般能够满足需求
 */
public class DCLSingleTon implements Serializable{
    private static volatile DCLSingleTon mInstance;
    private DCLSingleTon(){}

    public static DCLSingleTon getInstance(){
        if(mInstance == null){
            synchronized (DCLSingleTon.class){
                if(mInstance ==null){
                    mInstance = new DCLSingleTon();
                }
            }
        }
        return mInstance;
    }

    /**
     * 当JVM从内存中反序列化地"组装"一个新对象时,就会自动调用这个 readResolve方法
     */
    private Object readResolve() throws ObjectStreamException{
        return mInstance;
    }
}
