package com.itheima.test_string;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2023/9/17
 * @Description:StringBuilder
 * @Version:1.8
 * @Requirement:
 */
public class string10 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);


        //打印
        //普及：
        //因为StringBuilder是Java已经写好的类
        //Java在底层对他做了一些特殊的处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);

        //3.反转
        sb.reverse();
        System.out.println(sb);


        //4.获取长度
        int len = sb.length();
        System.out.println(len);

        //链式编程
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);


        //对称
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb2 = new StringBuilder();
        boolean result = sb2.append(str).reverse().toString().equals(str);
        System.out.println(result);
    }






}
