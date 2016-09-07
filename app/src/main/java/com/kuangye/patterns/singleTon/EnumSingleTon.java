package com.kuangye.patterns.singleTon;

/**
 * 枚举单例.
 *      默认情况下就是线程安全的且是单例的  且反序列化时也不会生成新的对象
 */
public enum  EnumSingleTon {
    INSTANCE;
}
