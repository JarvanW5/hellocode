package com.itheima.test_arraylist;

import java.util.ArrayList;

/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:添加学生对象并遍历的两个练习
 * @Version:1.8
 * @Requirement:定义一个集合，添加一些学生对象，并进行遍历学生类的属性为：姓名，年龄。
 */
public class arraylist03 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("wangwu",23);
        Student s3 = new Student("lisi",23);
        Student s4 = new Student("chenlei",23);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+student.getAge());
            
        }


    }
}
