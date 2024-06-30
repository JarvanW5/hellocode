package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:关系运算符
 * @VERSON:1.7
 */
public class Test6 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个数，表示你和别人的时髦度
         */


        // 1.键盘录入两个整数表示衣服的时髦度

        Scanner sc = new Scanner(System.in);
        System.out.println("输入自己的：");
        int my = sc.nextInt();
        System.out.println("输入别人的：");
        int other = sc.nextInt();
        System.out.println(my > other);
    }
}
