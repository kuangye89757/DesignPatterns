package com.kuangye.patterns.builder;

/**
 * Created by wangshijie on 2016/9/7.
 */
public class Test {
    public static void main(String[] args) {


        StudentConfig config = new StudentConfig.Build("1", "部门")
                .setAge(100)
                .setName("呵呵")
                .setSex("女")
                .setListener(new StudentConfig.ActionSheetListener() {
                    @Override
                    public void onDismiss() {
                        System.out.println("我是接口");
                    }
                })
                .build();
        Student.getInstance().init(config);

    }
}
