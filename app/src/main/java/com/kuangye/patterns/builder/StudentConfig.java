package com.kuangye.patterns.builder;

/**
 * Created by wangshijie on 2016/9/7.
 */
public class StudentConfig {
    private String id;
    private String name;
    private String sex;
    private String department;
    private int age;

    private StudentConfig(){}

    public static class Build {
        /**初始化一次 用于指定默认*/
        private String id;
        private String department;

        private String name = "";
        private String sex = "男";
        private int age = 20;
        private ActionSheetListener listener;

        /**必填项*/
        public Build(String id, String department) {
            this.id = id;
            this.department = department;
        }

        public Build setName(String name){
            this.name = name;
            return this;
        }

        public Build setSex(String sex){
            this.sex = sex;
            return this;
        }

        public Build setAge(int age){
            this.age = age;
            return this;
        }

        public Build setListener(ActionSheetListener listener){
            this.listener = listener;
            return this;
        }

        /**建造者模式方法*/
        public StudentConfig build(){
            StudentConfig student = new StudentConfig();
            appleConfig(student);
            return student;
        }

        /**
         * 应用配置
         * @param student
         */
        private void appleConfig(StudentConfig student){
            student.id = this.id;
            student.name = this.name;
            student.sex = this.sex;
            student.department = this.department;
            student.age = this.age;

            if(this.listener!=null){
                this.listener.onDismiss();
            }
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    public interface ActionSheetListener {
        void onDismiss();
    }

}
