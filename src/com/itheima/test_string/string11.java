package com.itheima.test_string;

import java.util.StringJoiner;

/**
 * @Author:JarvanW
 * @Date:2023/9/17
 * @Description:Stringjoiner
 * @Version:1.8
 * @Requirement:
 */
public class string11 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //3.打印结果
        System.out.println(sj);
    }
}
