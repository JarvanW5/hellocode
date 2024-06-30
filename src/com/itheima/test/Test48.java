package com.itheima.test;

import java.util.StringJoiner;

/*
 * @Auther:JarvanW
 * @Date:2023/8/3
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test48 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("----");
        sj.add("aaa");

        System.out.println(sj);

        sj.add("bbb");

        System.out.println(sj);

        System.out.println("...................................");

        StringJoiner sj1 = new StringJoiner(",", "[", "]");
        sj1.add("1").add("2").add("3");
        System.out.println(sj1 + "," + sj1.length());

    }
}
