package com.itheima.oop.oop09;

/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class Teacher extends Person {

    @Override
    public void show() {
        System.out.println("老师的信息为：" + getName() + "," + getAge());
    }
}
