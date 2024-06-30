package com.itheima.oop.oop09;


/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法

        Students s = new Students();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(20);



        register(s);
        register(t);

    }

    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把这个参数写成这三个类型的父类
    public static void register(Person p){
        p.show();

    }
}
